#!/usr/bin/env bash

echo $1 | sed 's/[aeiouAEIOU]//g'