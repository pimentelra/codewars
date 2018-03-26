#!/usr/bin/env bash

countToTwenty() {
  COUNT=1
  while [  $COUNT -le 20 ]; do
     echo Count: $COUNT
     COUNT=$((COUNT+1))
  done
}

countToTwenty