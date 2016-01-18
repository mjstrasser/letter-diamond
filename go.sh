#!/bin/bash

if hash scala 2>/dev/null; then
    scala -cp ./target/scala-2.11/classes diamond.Diamond $*
else
    echo "You need scala installed to run this program. Sorry (maybe)."
    exit 1
fi

