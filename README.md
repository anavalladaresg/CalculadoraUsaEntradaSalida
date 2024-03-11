# Proyecto Raíces

Este proyecto consiste en la implementación de un método para calcular cualquier raíz de un número.

## Proceso de desarrollo

1. Creé una nueva rama llamada 'raiz'.
2. Me moví a esta rama para trabajar en ella.
3. Creé la clase `Raices`.
4. Implementé el método `calcularRaiz` que permite calcular cualquier raíz de un número.
5. Generé la documentación Javadoc para la clase `Raices`.
6. Implementé el método `calcularRaiz` en la clase `Main` para comprobar que funciona correctamente.

## Método calcularRaiz

El método `calcularRaiz` en la clase `Raices` se podría implementar de la siguiente manera si solamente quisieramos calcular la raíz cuadrada o cúbica de un número:

```java
public double calcularRaiz(int indice, double numero) {
    double resultado = 0;
    if (indice == 2) {
        resultado = Math.sqrt(numero);
    } else if (indice == 3) {
        resultado = Math.cbrt(numero);
    }
    return resultado;
}