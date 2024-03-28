#include <stdio.h>
#include <stdlib.h>

void sum();
int main(void)
{
    sum();
    return 0;
}

void sum(){
    int num1, num2, sum;
    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);
    sum = num1 + num2;
    printf("Sum = %d", sum);
}