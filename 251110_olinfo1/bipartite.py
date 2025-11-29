#!/usr/bin/env python3
# NOTE: it is recommended to use this even if you don't understand the following code.

import sys

# uncomment the two following lines if you want to read/write from files
# sys.stdin = open('input.txt')
# sys.stdout = open('output.txt', 'w')

N, M = map(int, input().strip().split())

a = [0 for i in range(M)]
b = [0 for i in range(M)]
for i in range(M):
    a[i], b[i] = map(int, input().strip().split())

solution = 0


# INSERT YOUR CODE HERE


print(solution)

sys.stdout.close()
