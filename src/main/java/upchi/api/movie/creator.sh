#!/bin/bash

# Nombre de las entidades
echo "Ingrese el nombre de la entidad para generar su estructura"
read DIR
ENTITY=${DIR^}
mkdir $DIR

# Creacion de archiveros
mkdir $DIR/controllers
cd $DIR/controllers
cat <<EOF > ${ENTITY}Controller.java
package upchi.api.movie.${DIR}.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upchi.api.movie.${DIR}.services.interfaces.I${ENTITY}Service;

@RestController
@RequestMapping("${DIR}")
public class ${ENTITY}Controller {

    @Autowired
    I${ENTITY}Service service;

    // Por Hacer:
    // - Agregar las rutas correspondientes para las peticiones HTTP
    //     - GET, POST, UPDATE y DELETE

    // La interfaz del servicio ya están importados

    // Eliminar el método que viene por defecto  HelloWorld
    @GetMapping
    public String HelloWorld() {
        return "Hello World, we're in ${ENTITY}";
    }

}
EOF
cd -

mkdir $DIR/controllers/dtos
mkdir $DIR/controllers/dtos/responses
cd $DIR/controllers/dtos/responses
cat <<EOF > Get${ENTITY}Response.java
package upchi.api.movie.${DIR}.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Get${ENTITY}Response {

    // Por Hacer: 
    // - Agregar atributos necesarios
    
    // Este DTO servirá para devolver la información necesaria
    // de alguna petición GET para la entidad ${ENTITY}

    // Id debe ser obligtorio dentro de los response para fines demostrativos
    
    // No hace falta agregar Setters y Getters

    private Long id;

}
EOF
cd -

mkdir $DIR/controllers/dtos/requests
cd $DIR/controllers/dtos/requests
cat <<EOF > Post${ENTITY}Request.java
package upchi.api.movie.${DIR}.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Post${ENTITY}Request {
    // Por Hacer:
    // - Agregar los atributos para este DTO

    // No es necesario agregar los métodos setter y getter para este método.

    // Este DTO es para mandar información para crear un nuevo registro
    // de la entidad ${ENTITY} en la base de datos

    // Generar los DTOS necesarios para lo demás métodos si lo consideran necesario
}
EOF
cd -

mkdir $DIR/services
cd $DIR/services
cat <<EOF > ${ENTITY}ServiceImpl.java
package upchi.api.movie.${DIR}.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.${DIR}.repositories.I${ENTITY}Repository;
import upchi.api.movie.${DIR}.services.interfaces.I${ENTITY}Service;

@Service
public class ${ENTITY}ServiceImpl implements I${ENTITY}Service{

    @Autowired
    I${ENTITY}Repository repository;

    // Por Hacer:
    // - Generar métodos en I${ENTITY}Service y sobre escribir acá

    // Los métodos del repositorio ya están siendo importados
    // repository.metodo()
    
}
EOF
cd -

mkdir $DIR/services/interfaces
cd $DIR/services/interfaces
cat <<EOF > I${ENTITY}Service.java
package upchi.api.movie.${DIR}.services.interfaces;

public interface I${ENTITY}Service {
    // Por Hacer:
    // - Genera las interfaces de lo métodos para los servicios

    // Recuerda que mínimo deberán haber 4 métodos (del protocolo HTTP)
}
EOF
cd -

mkdir $DIR/repositories
cd $DIR/repositories
cat <<EOF > I${ENTITY}Repository.java
package upchi.api.movie.${DIR}.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.${DIR}.entities.${ENTITY};
import org.springframework.data.jpa.repository.JpaRepository;

// No es necesario ninguna acción acá

@Repository
public interface I${ENTITY}Repository extends JpaRepository<${ENTITY}, Long>{}
EOF
cd -

mkdir $DIR/entities
cd $DIR/entities
cat <<EOF > ${ENTITY}.java
package upchi.api.movie.${DIR}.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "${DIR}s")
@Setter @Getter
public class ${ENTITY} {

    // Por Hacer:
    // - Verifica que el nombre de la tabla esté generado correctamente
    // - Añade los atributos necesarios, recuerda que debe ser en inglés

    // No hace falta generar Getter y Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
EOF
cd -