#!/bin/bash

CP=./target/scala-2.11/classes

if hash sbt 2>/dev/null; then
    if [ ! -f $CP/diamond/Diamond.class ]; then
        sbt test
    fi
    scala -cp $CP diamond.Diamond $*
else
    echo "You need scala and SBT installed to run this program."
    exit 1
fi

