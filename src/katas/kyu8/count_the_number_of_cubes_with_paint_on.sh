echo $((6 * $1 * $1 + $([[ $1 == 0 ]] && echo 1 || echo 2)))