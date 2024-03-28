#include <stdio.h>
#include <stdlib.h>

int main()
{
    char name[50];
    printf("Enter your first name: ");
    scanf("%s", name);
    printf("Hello, %s!", name);
    return 0;
}