#include <stdio.h>

int main() {
    int n, i;
    
    printf("Enter the value of n: ");
    scanf("%d", &n);
    
    printf("Even numbers up to %d are: ", n);
    for(i = 1; i <= n; i++) {
        if(i % 2 == 0) {
            printf("%d ", i);
        }
    }
    
    printf("\n");
    
    return 0;
}