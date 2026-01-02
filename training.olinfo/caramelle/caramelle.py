#!/usr/bin/env python3
# NOTA: si raccomanda di usare questo template anche se non lo si capisce completamente.

import sys
# import math

def mcm(a, b):
    return abs((a * b) / mcd(a, b))    

def mcd(a, b):
    r = 0
    while b != 0:
        r = a % b
        a = b
        b = r
    return abs(a)

# decommenta le due righe seguenti se vuoi leggere/scrivere da file
sys.stdin = open('input.txt')
sys.stdout = open('output.txt', 'w')

T = int(input().strip())
for test in range(1, T+1):
    input()
    N = int(input().strip())

    V = list(map(int, input().strip().split()))

    c = 0


    # INSERISCI IL TUO CODICE QUI
    temp = V[0]
    for i in V:
        temp = mcm(temp, i) 
    
    c = int(temp)

    print("Case #%d: " % test, end='')
    print(c)

sys.stdout.close()
