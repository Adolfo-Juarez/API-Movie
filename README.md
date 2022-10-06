<!-- 
Este documento es de informativo, NO MODIFICAR
-->

# API-MOVIE
## Descripción
Este proyecto presentará información de películas, los actores, productores, directores y lugar de su primera función.

## Distribución de trabajo
El proyecto se dividirá por entidad, de la siguiente manera:

+ **Adolfo**: Films y Directors
+ **Leonardo**: Actors
+ **Yadira**: Premiers
+ **Isaí**: Studios


Cada entidad está dentro de un paquete con sus respectiva carpeta de Controladores, DTOS, Entidad, Servicios, Interfaces y Repositorios.

Cada entidad ya contiene código generado para tener un inicio rápido de sus actividades.

La configuración del proyecto está hecha para trabajar con **Java 17**  y en un entorno local, por lo que es indispensable tener activo sus sistema de gestión de base de datos, como **Xampp** y tener un base de datos creada con el nombre de **api_movie**. Puedes verificar estas configuraciones dentro de **aplication.propierties**.

El desarrollo de este proyecto se dividirá por fases, y evolucionará según los temas que veamos en clases.


### Fase 1 - FINALIZADO
- Generar la estructura de las entidades y  DTOS.
- Crear los servicios necesarios y la interfaz.
- Implementar los servicios en los controladores para habilitar las peticiones, por defecto, cada entidad puede hacer sus peticiones en la ruta http://localhost:8080/tu-entidad.

### Fase 2 - FINALIZADO
- Relacionar las tablas.
- Crear las tablas pivote necesarias para las relaciones.
- Habilitar columna para almacenar las foreign keys de las tablas relacionadas.

### Fase 3 - [A discutir]
- Crear los servicios necesarios para poder almacenar las imágenes organizadas en carpetas de forma local.
- Retornar y almacenar en la base de datos la ruta local de las imágenes.

### Fase 3.1 - Actual
- Configurar los servicios y proyecciones de las uniones
- Habilitar los end-points para hacer las peticiones

### Fase 4
- Migrar al entorno de los servicios de AWS.

---------------------

## Modelo Entidad-Relación
### Modelo previsto
![Modelo entidad relación](info-img/Entities.png)
### Modelo final 
Renderizado por PhpMyAdmin
![Modelo entidad relacion from PhpMyAdmin](info-img/api_movie.svg)