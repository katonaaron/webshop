#!/bin/bash

fileName=Webshop
sourceFile=common/src/main/scribble/${fileName}.scr
destPath=common/src/main/java/
package=com/fullcart/session/
imagePath=../doc/img/protocols/

declare -A protocols=(
  ['ProductSession']="C P"
  ['UserSession']="C U"
  ['BuyingSession']="C P U B"
)

function verify() {
  ./scribblec.sh ${sourceFile} -fair
}

function generate_code() {
  protocol="$1"
  role="$2"
  ./scribblec.sh ${sourceFile} -d ${destPath} -api "$protocol" "$role" -fair
}

if ! verify; then
  echo "Invalid"
  exit 1
fi

echo "Valid"


for protocol in "${!protocols[@]}"; do

  rm -rf "${destPath}${package}/${fileName}/${protocol}"

  declare -a roles=(${protocols[$protocol]})

  for role in "${roles[@]}"; do
    generate_code "$protocol" "$role"
  done
done

# Generate images

mkdir -p "$imagePath"

root=$(pwd)
cd "$imagePath" || exit

for protocol in "${!protocols[@]}"; do

  eval "$root/scribblec.sh \"$root/$sourceFile\" -modelpng $protocol $protocol.png -fair"

  declare -a roles=(${protocols[$protocol]})

  for role in "${roles[@]}"; do
    eval "$root/scribblec.sh \"$root/$sourceFile\" -fsmpng $protocol $role ${protocol}_${role}.png -fair"
  done
done
