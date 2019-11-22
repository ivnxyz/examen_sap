#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void magicNumber(int digits[], int digitsLength, int lastNumber);
int getNumberDigitsLength(int number);
void intToArray(int number, int numberArray[]);

/*
  Autor: Iván Martínez (42009069-4)
*/

int main() {
  // Guardar número
  int num;

  printf("Ingresa un múltiplo de 3: ");
  scanf("%d", &num);

  printf("===============================\n");

  if (num % 3 == 0) {
    // Almacenar digitos en un array de enteros
    int digitsLength = getNumberDigitsLength(num);
    int digits[digitsLength];
    intToArray(num, digits);

    // Llamar a la función de magicNumber
    magicNumber(digits, digitsLength, -1);
  } else {
    printf("El número debe ser múltiplo de 3 >:(\n");
  }

  return 0;
}

void magicNumber(int digits[], int digitsLength, int lastNumber) {
  int sum = 0;

  for (int i = 0; i < digitsLength; i++) {
    // Almacenar el cubo de cada dígito
    sum += digits[i] * digits[i] * digits[i];

    if (i == 0) {
      printf("%d^3 ", digits[i]);
    } else {
      printf(" + %d^3 ", digits[i]);
    }
  }

  if (sum == lastNumber) {
    printf(" = %d\n", sum);
  } else {
    printf(" = %d\n", sum);
    // Obtener los digitos de la suma
    int sumLength = getNumberDigitsLength(sum);
    int sumDigits[sumLength];
    intToArray(sum, sumDigits);

    // Llamar nuevamente a magicNumber
    magicNumber(sumDigits, sumLength, sum);
  }
}

int getNumberDigitsLength(int number) {
  // Calcular el número de digitos
  int count = 0;
  int n = number;

  while (n != 0) {
    n /= 10;
    count++;
  }

  return count;
}

void intToArray(int number, int numberArray[]) {
  int count = 0;
  int n = number;

  while (n != 0){
      numberArray[count] = n % 10;
      n /= 10;
      count++;
  }
}
