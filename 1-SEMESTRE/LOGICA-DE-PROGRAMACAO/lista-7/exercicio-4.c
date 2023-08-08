#include <stdio.h>

int main() {
    double A = 0;
    int i;
    for (i = 1; i <= 25; i++) {
        A += (2.0 * i - 1) / i;
    }
    printf("A = %f\n", A);
    return 0;
}
