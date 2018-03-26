#!/usr/bin/env bash

if [[ $1 =~ "#" ]]; then
   echo $1 | cut -d'#' -f 1
else
   echo $1
fi