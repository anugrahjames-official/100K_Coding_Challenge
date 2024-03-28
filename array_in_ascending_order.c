#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, n, j, temp;
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
    for (i = 0; i < n-1; i++) {
        for(j =i+1; j < n; j++) {
            if(array[i] > array[j]) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
    printf("\nArray elements in ascending order: ");
        for (i = 0; i < n; i++) {
            printf("%d ", array[i]);
        }
    return 0;
}