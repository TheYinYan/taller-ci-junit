# Taller CI con GitHub Actions y JUnit 5

Proyecto de ejemplo para aprender integración continua con GitHub Actions.

## Requisitos

- Java 17+
- Maven 3.8+

## Comandos

### Compilar el proyecto
```bash
mvn compile
```

### Ejecutar tests
```bash
mvn test
```

### Limpiar archivos generados
```bash
mvn clean
```

### Compilar y ejecutar tests
```bash
mvn clean test
```

## Estado del CI

![CI Status](https://github.com/USUARIO/REPO/workflows/CI/badge.svg)

## Estructura del proyecto

```
taller-ci-junit/
├── .github/
│   └── workflows/
│       └── ci.yml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── taller/
│   │               └── Calculator.java
│   └── test/
│       └── java/
│           └── com/
│               └── taller/
│                   └── CalculatorTest.java
├── .gitignore
├── pom.xml
└── README.md
```

## Descripción

Este proyecto incluye:

- **Calculator.java**: Clase simple con operaciones matemáticas básicas
- **CalculatorTest.java**: Tests unitarios usando JUnit 5
- **ci.yml**: Workflow de GitHub Actions para integración continua
- **pom.xml**: Configuración de Maven con dependencias y plugins

## Características

- ✅ Tests unitarios con JUnit 5
- ✅ Integración continua con GitHub Actions
- ✅ Ejecución automática de tests en cada push/PR
- ✅ Subida de reportes de tests como artefactos

[Mi proyecto en GitHub](ejercicios/Readme.md)

[Readme Taller](../README.md)