#!/usr/bin/env bash

distance=$1

counter=0
thick=0.0001

if (( $(echo "$distance < 0" | bc -l) )); then
  echo None
else
  while [ "$(bc <<< "$thick < $distance")" == "1"  ]; do
      thick=2*$thick
      counter=$((counter+1))
    done

  echo $counter
fi