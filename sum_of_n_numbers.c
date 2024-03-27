#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, n, sum = 0;
    
    printf("Enter a number: ");
    scanf("%d", &n);
    
    for (i = 1; i <= n; i++) {
        sum = sum + i;
    }
    
    printf("Sum of the first %d numbers = %d", n, sum);
    
    return 0;
}