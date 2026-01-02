#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

typedef struct Node {
    int value;
    struct Node* nextNode;
    bool isEliminated;
} Node;

int main() {
    int Q, N;
    int j = 0;
    Node* nodes;
    Node currentNode;
    
    Q = scanf("%d", &Q);
    
    for (int i = 0; i < Q; i++) {
        scanf("%d", &N);

        if (N == 0) continue;
        if (N == 1 || N == 2) {
            printf("%d\n", 1);
            continue;
        }

        nodes = calloc(N, sizeof(Node));
        
        for (j = 0; j < N; j++) {
            nodes[j].value = j+1;
            nodes[j].nextNode = &nodes[(j + 1) % (N - 1)];
            nodes[j].isEliminated = false;
        }

        currentNode = nodes[0];

        for (j = 0; j < N - 1; j++) {
            if (currentNode.nextNode->isEliminated) {
                currentNode = *currentNode.nextNode;
            } else {

            }

        }


        printf("%d\n", 42);
        free(nodes);
    }

    return 0;
}