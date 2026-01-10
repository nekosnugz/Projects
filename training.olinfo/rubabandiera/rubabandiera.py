#!/usr/bin/python3

# with open("output.txt", 'w+') as f:
Q = int(input())

for i in range(Q):
    N = int(input())
    A = []
    j = 0

    for k in range(N):
        A.append(k+1)

    tmp = 0
    endedOnLastElement = True
    
    while len(A) > 1:
        for i in range(len(A)):
            if (i + endedOnLastElement) % 2 == 0:
                tmp = A[i-1]
                A[i] = 0
                pass

        A = list(set(A).remove(0)).sort()

        endedOnLastElement = (tmp == A[-1])
        # f.write(f"{A}\n")
    
    print(A[0])