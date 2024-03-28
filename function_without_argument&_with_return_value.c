#include <stdio.h>
#include <stdlib.h>

int sum();
int main()
    {
    int k;
    k = sum();
    printf("Sum = %d", k);
    return 0;
    }

int sum()
    { int c,a,b;
    printf("Enter 2 numbers");
    scanf("%d %d", &a, &b);
    c = a + b;
    return c;
    }
