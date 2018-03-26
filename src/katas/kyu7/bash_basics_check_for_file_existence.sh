#!/usr/bin/env bash

if [ $# -eq 0 ]; then
  echo "Nothing to find"
  exit 0
fi
[ -f $1 ] && echo "Found $1" || echo "Can't find $1"