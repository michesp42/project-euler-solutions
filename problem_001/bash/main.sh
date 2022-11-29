#!/usr/bin/env bash

solution() {
  sum=0

  for i in {3..999}; do
    if [ $((i % 3)) -eq 0 ] || [ $((i % 5)) -eq 0 ]; then
      sum=$((sum + i))
    fi
  done

  echo "$sum"
}

solution
