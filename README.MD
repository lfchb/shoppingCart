# Shopping Cart Automation - SerenityBDD with Gradle

Este repositorio contiene pruebas funcionales automatizadas (E2E) para un flujo de compra en la página [http://opencart.abstracta.us/](http://opencart.abstracta.us/) utilizando SerenityBDD, Gradle y el patrón Screenplay.

## Table of Contents
- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Getting the Code](#getting-the-code)
- [Running Tests](#running-tests)


## Project Overview

Este proyecto tiene como objetivo validar el proceso de compra en un entorno de comercio electrónico, asegurando que todas las funcionalidades funcionen como se espera. Las pruebas están diseñadas utilizando el patrón Screenplay, lo que mejora la mantenibilidad y legibilidad.

## Prerequisites

Antes de ejecutar las pruebas, asegúrate de tener instaladas las siguientes versiones:

- **Java:** 21.0.4
- **Gradle:** 8.5
- **Versión de Chrome:** Versiones menores a 114.0.5735.199

Asegúrate de que tus variables de entorno estén configuradas correctamente para Java y Gradle.

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



