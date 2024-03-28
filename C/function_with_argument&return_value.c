#include <stdio.h>
#include <stdlib.h>

int sum(int num1, int num2);

int main(void)
{
    int a, b, output;
    printf("Enter 2 numbers: ");
    scanf("%d %d", &a, &b);
    output = sum(a, b);
    printf("Sum = %d", output);
    return 0;
}

int sum(int num1, int num2)
{
    int result;
    result = num1 + num2;
    return result;
}