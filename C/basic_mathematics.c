#include <stdio.h>

int main() {
    int num1, num2, num3, choice;
    char again;

    do {
        printf("Enter three numbers: ");
        scanf("%d %d %d", &num1, &num2, &num3);
        printf("For addition: 1\nFor subtraction: 2\nFor multiplication: 3\nFor division: 4\n");
        scanf("%d", &choice);

        switch(choice) {
            case 1:
                printf("Sum = %d\n", num1 + num2 + num3);
                break;
            case 2:
                printf("Difference = %d\n", num1 - num2 - num3);
                break;
            case 3:
                printf("Product = %d\n", num1 * num2 * num3);
                break;
            case 4:
                printf("Quotient = %d\n", num1 / num2 / num3);
                break;
            default:
                printf("Invalid choice\n");
        }

        printf("Do you want to perform another operation? (Y/N): ");
        scanf(" %c", &again);
    } while (again == 'Y' || again == 'y');

    return 0;
}