#!/bin/bash

mvn clean 
mvn compile
mvn compile -P generateSources

if [ $? -ne 0 ]
then
echo "ERROR copying and generating sources. Stopped execution"

exit 1
fi

mvn install -P postProcessSources

