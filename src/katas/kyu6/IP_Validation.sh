#!/usr/bin/env bash
adr="$1"
ip_regex="((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?)"

if [[ ${adr} =~ ^$ip_regex$ ]]; then
  echo "True"
else
  echo "False"
fi