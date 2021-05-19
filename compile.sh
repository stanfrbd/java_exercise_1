#!/bin/sh

# compile.sh

javac -d bin $(find ./src/ -type f -name '*.java')

