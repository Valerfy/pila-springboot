# Pila Spring Boot

## Sobre el proyecto

Este es un proyecto hecho en **Java 27 con Spring Boot** para trabajar con una estructura de datos tipo pila.

La aplicación permite registrar estudiantes y hacer las operaciones básicas de una pila:

* Agregar
* Quitar
* Mostrar
* Ver el tamaño

La pila funciona con **LIFO**, por lo que el último estudiante agregado es el primero en salir.

## Requisitos

Para ejecutar el proyecto se necesita:

* Java 27
* Un navegador
* Git

No es necesario instalar Maven porque el proyecto ya incluye Maven Wrapper.

Para comprobar Java:

```bash
java -version
```

## Cómo ejecutar

Primero clonamos el proyecto:

```bash
git clone https://github.com/Valerfy/pila-springboot.git
```

Entramos a la carpeta:

```bash
cd pila-springboot
```

Después compilamos:

```bash
.\mvnw.cmd clean package
```

Si todo está bien, debe aparecer:

```text
BUILD SUCCESS
```

Para iniciar el proyecto:

```bash
.\mvnw.cmd spring-boot:run
```

También se puede ejecutar el `.jar` generado:

```bash
java -jar target\pila-0.0.1-SNAPSHOT.jar
```

Cuando esté iniciado, entramos desde el navegador a:

```text
http://localhost:8080
```

## Cómo usarlo

Para agregar un estudiante se deben llenar todos los campos:

* Código
* Nombres
* Apellidos
* Email
* Fecha de nacimiento
* Género

Después se presiona **Agregar**.

También están los botones:

**Mostrar:** muestra los estudiantes que están en la pila.

**Quitar:** elimina el último estudiante que se agregó.

**Tamaño:** muestra cuántos estudiantes hay en la pila.

La pila tiene espacio para **20 estudiantes**.

## Archivos principales

**PilaApplication.java:** inicia la aplicación.

**Estudiante.java:** contiene los datos del estudiante.

**Pila.java:** contiene la implementación de la pila usando un arreglo. Aquí están los métodos `agregar()`, `quitar()`, `mostrar()` y `tamanyo()`.

**PilaController.java:** recibe las acciones que se hacen desde la página y las conecta con la pila.

**index.html:** es la página que se utiliza para ingresar los estudiantes y probar las operaciones.

**application.properties:** contiene la configuración básica del proyecto.

## Repositorio

https://github.com/Valerfy/pila-springboot.git

## Autor

Matías Valero Fernandez
