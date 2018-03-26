#!/usr/bin/env bash

function removeChar() {
  arg=$1
  return ${arg:1:-1}
}
removeChar $1