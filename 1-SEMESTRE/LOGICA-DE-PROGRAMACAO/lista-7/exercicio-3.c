#include <stdio.h>

int main() {
    for (int i = 32; i <= 126; i++) {
        printf("%d -> %c -> %x\n", i, i, i);
    }

    return 0;
}
