#!/usr/bin/python3

Q = int(input())

for i in range(Q):
    N = int(input())
    A = []
    j = 0

    for k in range(N):
        A.append(k+1)

    print(A)

    for i in range(N-1):
        A.pop((i+1) % len(A))
        print(A)

    print("Result: ", A[0])