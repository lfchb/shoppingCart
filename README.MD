# Shopping Cart Automation - SerenityBDD with Gradle

Este repositorio contiene pruebas funcionales automatizadas (E2E) para un flujo de compra en la página [http://opencart.abstracta.us/](http://opencart.abstracta.us/) utilizando SerenityBDD, Gradle y el patrón Screenplay.

## Table of Contents
- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Getting the Code](#getting-the-code)
- [Configure ChromeDriver](#running-tests)
- [Running Tests](#running-tests)


## Project Overview

Este proyecto tiene como objetivo validar el proceso de compra en un entorno de comercio electrónico, asegurando que todas las funcionalidades funcionen como se espera. Las pruebas están diseñadas utilizando el patrón Screenplay, lo que mejora la mantenibilidad y legibilidad.

## Prerequisites

Antes de ejecutar las pruebas, asegúrate de tener instaladas las siguientes versiones:

- **Java:** 21.0.4
- **Gradle:** 8.5
- **Versión de Chrome:**  (última versión estable)

Asegúrate de que tus variables de entorno estén configuradas correctamente para Java y Gradle.

### Configure ChromeDriver
1.  Verifica la Versión de Google Chrome 
- Abre Google Chrome. 
- Haz clic en el menú de tres puntos en la esquina superior derecha. 
- Selecciona Ayuda > Acerca de Google Chrome. 
- Anota la versión de Chrome que tienes instalada (Ejemplo: 104.0.5112.79).

2. Configura y prueba WebDriverManager en la Clase "BaseTest"
- En la clase "BaseTest" se configuró el WebDriverManager para obtener la versión correcta de ChromeDriver

3. En caso de tener problemas con WebDriverManager puedes realizar la instalación de forma manual, asegurandote de que ChromeDriver coincida con tu Versión de Chrome, para esto puedes seguir los siguientes pasos:
- Visita la página de descargas de ChromeDriver.
- Busca la versión de ChromeDriver que coincide con la versión de Chrome instalada en tu máquina.
- Instala ChromeDriver


### Getting the Code
Para clonar este repositorio, usa:
```
git clone git@github.com:lfchb/shoppingCart.git
```

## Running Tests

Para ejecutar las pruebas, navega al directorio del proyecto en tu terminal y utiliza los siguientes comandos:

### Run All Tests
Para ejecutar todos los test:
```
./gradlew clean test
```
### Run Tests in Chrome
Para ejecutar pruebas usando Chrome, ejecuta:
```
./gradlew clean test -Dwebdriver.driver=chrome
```

### Run Tests in Firefox
Para ejecutar pruebas usando Firefox, utiliza:
```
./gradlew clean test -Dwebdriver.driver=firefox
```



