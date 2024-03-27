#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int array[n];

    for (i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &array[i]);
    }

    printf("Array elements: ");
    for (i = 0; i < n; i++) {
        printf("%d ", array[i]);
    }

    return 0;
}