#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, n,searchkey;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int array[n];

    for (i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &array[i]);
    }
    printf("Enter the search key: ");
    scanf("%d", &searchkey);
    for (i = 0; i < n; i++) {
        if (array[i] == searchkey) {
            printf("Element found at index %d\n", i);
            break;
        }
    }
    return 0;
}