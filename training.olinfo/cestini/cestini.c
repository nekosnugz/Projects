#include <assert.h>
#include <stdio.h>
#include <stdlib.h>

void solve(int t) {
    int N, M, Q;
    char *S;
    scanf("%d%d%d\n", &N, &M, &Q);
    S = (char *) malloc(N * sizeof(char));
    scanf("%s\n", S);

    // Aggiungi codice se vuoi

    char *risposta = (char *) malloc((Q + 1) * sizeof(char));
    int n_controlli = 0;

    for (int i = 0; i < Q; i++) {
        char type;
        int a, b;
        scanf(" %c%d%d", &type, &a, &b);

        if (type == 's') {
            // Aggiungi codice...

        } else {
            // Aggiungi altro codice...

            risposta[n_controlli++] = 'A';
        }
    }

    risposta[n_controlli] = '\0';

    printf("Case #%d: %s\n", t, risposta);
}

int main() {
    int T, t;

    // Se preferisci leggere e scrivere da file
    // ti basta decommentare le seguenti due righe:

    // freopen("input.txt", "r", stdin);
    // freopen("output.txt", "w", stdout);

    assert(1 == scanf("%d", &T));

    for (t = 1; t <= T; t++) {
        solve(t);
    }

    return 0;
}
