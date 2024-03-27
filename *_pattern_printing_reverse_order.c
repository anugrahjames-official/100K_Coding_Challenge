#include <stdio.h>
#include <stdlib.h>
int main ()
{
    int i, j, n;
    printf("Enter the number of rows: ");
    scanf("%d", &n);
    for(i = n; i <= n; i--)
    {
        for (j = 0; j <i; j++)
        {printf("*");}
        printf("\n");
    }
    return 0;
}