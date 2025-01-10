# Challenge - Conversor de Monedas

Este proyecto fue desarrollado como parte de un desafío propuesto por el curso de Alura Latam para desarrolladores back-end. Su objetivo principal fue aprender a interactuar con una API y construir una aplicación funcional que permita realizar conversiones entre diferentes monedas. Este fue el primer trabajo del autor utilizando una API.

## Descripción del Proyecto

El **Conversor de Monedas** es una aplicación en Java que utiliza la API de ExchangeRate para realizar conversiones entre las siguientes monedas:

- Dólar estadounidense (USD) y Peso argentino (ARS).
- Dólar estadounidense (USD) y Real brasileño (BRL).
- Dólar estadounidense (USD) y Peso colombiano (COP).

La aplicación ofrece un menú interactivo para que el usuario seleccione las opciones deseadas y realice conversiones de manera sencilla.

## Tecnologías Utilizadas

- **Lenguaje de Programación**: Java 17
- **API Utilizada**: ExchangeRate API ([Documentación oficial](https://www.exchangerate-api.com/docs/java-currency-api))
- **IDE**: IntelliJ IDEA

## Características Principales

- Interfaz de línea de comandos interactiva.
- Validación de entradas para garantizar que el usuario solo ingrese valores válidos.
- Manejo de excepciones para evitar errores en el flujo de ejecución.
- Conexión HTTP para realizar consultas en tiempo real a la API de ExchangeRate.

## Instalación y Ejecución

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/tu-usuario/Challenge-Conversor-Monedas.git
   ```

2. Abre el proyecto en tu IDE preferido.

3. Asegúrate de tener instalada una versión compatible de Java (Java 17 o superior).

4. Genera una clave API desde [ExchangeRate](https://www.exchangerate-api.com/). Esta clave es necesaria para que la aplicación pueda realizar consultas.

5. Ejecuta la aplicación desde el método principal (`Main.java`).

## Uso

1. Al iniciar la aplicación, el usuario debe ingresar su clave API.
2. Selecciona una de las opciones del menú:

   ```
   1. Convertir Dólar a Peso Argentino
   2. Convertir Peso Argentino a Dólar
   3. Convertir Dólar a Real Brasileño
   4. Convertir Real Brasileño a Dólar
   5. Convertir Dólar a Peso Colombiano
   6. Convertir Peso Colombiano a Dólar
   7. Salir
   ```

3. Ingresa la cantidad que deseas convertir.
4. La aplicación consultará la API y mostrará el resultado en pantalla.

## Ejemplo de Ejecución

```
*****************************************
Bienvenido/a al Conversor de Monedas

   1- Dólar ==> Peso Argentino
   2- Peso Argentino ==> Dólar
   3- Dólar ==> Real Brasileño
   4- Real Brasileño ==> Dólar
   5- Dólar ==> Peso Colombiano
   6- Peso Colombiano ==> Dólar
   7- Salir
Elija una opción válida:
*****************************************
1
Ingresar cantidad:
100
Resultado: $35000.00 ARS
```

## Lecciones Aprendidas

- Conexión a servicios externos a través de una API REST.
- Manejo de excepciones en Java para entradas y errores de conexión.
- Validación de datos ingresados por el usuario.
- Uso de `HttpURLConnection` y JSON parsing en Java.

## Autor

**Juan Pablo Ovalle**

- [GitHub](https://github.com/Ovalle97)
- [LinkedIn](https://www.linkedin.com/in/juan-ovalle-93a2ba27b/)

## Licencia

Este proyecto está bajo la licencia MIT. 

