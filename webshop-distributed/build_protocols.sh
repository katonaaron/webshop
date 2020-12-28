#!/bin/bash

sourcePath=common/src/main/java/
packagePath=com/fullcart/session/

./scribblec.sh ${sourcePath}${packagePath}Webshop.scr
echo $?
./scribblec.sh ${sourcePath}${packagePath}Webshop.scr -d ${sourcePath} -api ProductSession C
./scribblec.sh ${sourcePath}${packagePath}Webshop.scr -d ${sourcePath} -api ProductSession P
./scribblec.sh ${sourcePath}${packagePath}Webshop.scr -d ${sourcePath} -modelpng ProductSession ProductSession.png


