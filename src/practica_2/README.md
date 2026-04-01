# Practica 2 - Kotlin (POO)

Este modulo contiene tres ejercicios orientados a practicar programacion orientada a objetos en Kotlin: validacion de
propiedades, herencia/polimorfismo y modelado de un sistema de biblioteca.

## Contenido

### 1) `Product.kt`

- Clase `Product` con propiedades `price` y `discount` validadas en sus *setters*.
- Metodo `finalPrice()` para calcular el precio final aplicando descuento.
- Incluye un `main()` de prueba.

### 2) `Shape.kt`

- Clase abstracta `Shape` con metodos `area()` y `perimeter()`.
- Implementaciones concretas:
    - `Square`
    - `Rectangle`
    - `Circle`
- Incluye un `main()` que instancia cada figura y muestra resultados.

### 3) Sistema de biblioteca (`library/`)

- Interfaz `ILibrary` con operaciones basicas de prestamo/devolucion.
- Modelo de dominio:
    - `Material` (abstracta)
    - `Book`
    - `Journal`
    - `User`
- Servicio `Library` que administra:
    - materiales disponibles
    - materiales prestados por usuario
    - usuarios registrados
- `library/Main.kt` ejecuta un flujo completo de ejemplo.


