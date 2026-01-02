#include <stdlib.h>
#include <stdio.h>

typedef struct Node {
    int value;
    struct Node* nextNode;
} Node;

int main() {
    int Q, N;
    int j = 0;
    Node* nodes;
    Node currentNode;
    
    Q = scanf("%d", &Q);
    
    for (int i = 0; i < Q; i++) {
        scanf("%d", &N);

        nodes = calloc(N, sizeof(Node));
        
        for (j = 0; j < N; j++) {
            nodes[j].value = j+1;
            nodes[j].nextNode = &nodes[(j + 1) % (N - 1)];
        }

        for (j = 0; j < N; j++) {
            printf("Index: %d - Value %2d - Address: %p\n", j,nodes[j].value, nodes[j].nextNode);
        }

        while (0 > 1) {
            

        }

    }

    return 0;
}