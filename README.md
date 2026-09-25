# Pila Spring Boot

## ¿De qué trata?

Este proyecto es una aplicación web hecha con **Java 27 y Spring Boot** para trabajar con una estructura de datos tipo Pila.

La aplicación permite agregar estudiantes y realizar las operaciones:

* Agregar
* Quitar
* Mostrar
* Tamaño

La pila está hecha usando un arreglo y funciona con el método **LIFO**, es decir, el último estudiante que entra es el primero que sale.

## Requisitos

Para poder ejecutar el proyecto se necesita:

* Java JDK 27
* Un navegador
* El proyecto descargado

El proyecto ya tiene Maven Wrapper, así que no hace falta instalar Maven aparte.

Para comprobar Java:

```bash
java -version
```

## Descargar el proyecto

Si el proyecto está en GitHub o GitLab, se puede descargar con:

```bash
git clone URL_DEL_REPOSITORIO
```

Después entramos a la carpeta:

```bash
cd pila-springboot
```

## Compilar

Abrimos la terminal dentro de la carpeta del proyecto y ejecutamos:

```bash
.\mvnw.cmd clean package
```

Si todo está bien, al final debe aparecer:

```text
BUILD SUCCESS
```

## Ejecutar

Después de compilar, ejecutamos:

```bash
java -jar target\pila-0.0.1-SNAPSHOT.jar
```

También se puede iniciar con:

```bash
.\mvnw.cmd spring-boot:run
```

## Abrir la página

Cuando el proyecto esté ejecutándose, abrimos el navegador y entramos a:

```text
http://localhost:8080
```

## ¿Cómo se usa?

### Agregar

Se llenan los datos del estudiante:

* Código
* Nombres
* Apellidos
* Email
* Fecha de nacimiento
* Género

Después se presiona **Agregar**.

### Mostrar

Presionando **Mostrar** se pueden ver los estudiantes que están actualmente en la pila.

### Quitar

Con **Quitar** se elimina el último estudiante que se agregó.

Por ejemplo:

```text
Estudiante 1
Estudiante 2
Estudiante 3
```

Si presionamos Quitar, sale primero el **Estudiante 3**.

### Tamaño

Con **Tamaño** podemos saber cuántos estudiantes hay actualmente en la pila.

Por ejemplo:

```text
Tamaño de la pila: 3
```

## Capacidad

La pila tiene espacio para **20 estudiantes**.

Esto está definido en el controlador con:

```java
new Pila(20)
```

## Archivos principales

```text
PilaApplication.java
```

Es el archivo que inicia el proyecto.

```text
Estudiante.java
```

Aquí están los datos del estudiante.

```text
Pila.java
```

Aquí se encuentra la estructura de la pila y sus métodos:

* agregar()
* quitar()
* mostrar()
* tamanyo()

```text
PilaController.java
```

Se encarga de conectar la página web con las funciones de la pila.

```text
index.html
```

Es la página donde se ingresan los estudiantes y se usan los botones.

```text
application.properties
```

Aquí está la configuración básica del proyecto.

## Repositorio

El proyecto se encuentra en un repositorio público de GitHub o GitLab.

```text
PEGAR_AQUÍ_EL_ENLACE
```

## Autor

Matías Valero Fernandez
