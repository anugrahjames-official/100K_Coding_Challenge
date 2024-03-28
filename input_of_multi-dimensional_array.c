#include <stdio.h>
#include <stdlib.h>

int main()
{   
    int i, j, array[3][3];
    printf("Enter values of array : ");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            scanf("%d", &array[i][j]);
        }
    }
    printf("Values of array : \n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("%d\t", array[i][j]);
        }
        printf("\n");
    }
    return 0;
}