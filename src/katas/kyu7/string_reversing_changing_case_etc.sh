#!/usr/bin/env bash

ANSWER=$(echo $2 | tr 'a-zA-Z' 'A-Za-z' | rev)
ANSWER="$ANSWER@@@"
ANSWER="$ANSWER$(echo $1 | tr 'a-zA-Z' 'A-Za-z' | rev)"
ANSWER="$ANSWER$(echo $1 | tr 'a-zA-Z' 'A-Za-z')"
echo $ANSWER