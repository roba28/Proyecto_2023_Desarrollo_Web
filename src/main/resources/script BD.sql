/*Creación de la base de datos*/
drop schema if exists sistema_incidentes;
drop user if exists project_manager;
CREATE SCHEMA sistema_incidentes;

/*Creación del usuario y su contraseña*/
create user 'project_manager'@'%' identified by 'pm1001';
/*Asignación de permisos al usuario*/
grant all privileges on sistema_incidentes. * to 'project_manager'@'%';
flush privileges;

create table sistema_incidentes.provincia (
  provincia INT NOT NULL PRIMARY KEY,
  nombre_provincia VARCHAR(20) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.canton (
  provincia INT NOT NULL,
  canton INT NOT NULL PRIMARY KEY,
  nombre_canton VARCHAR(20) NOT NULL,
  FOREIGN KEY fk_provincia_canton(provincia) REFERENCES provincia(provincia))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.distrito (
  provincia INT NOT NULL,
  canton INT NOT NULL,
  distrito INT NOT NULL PRIMARY KEY,
  nombre_distrito VARCHAR(20) NOT NULL,
  FOREIGN KEY fk_provincia_canton(provincia) REFERENCES provincia(provincia),
  FOREIGN KEY fk_canton_distrito(canton) REFERENCES canton(canton))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.estado_usuario (
  estado_usuario INT NOT NULL PRIMARY KEY,
  descripcion VARCHAR(20) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.prioridad (
  prioridad INT NOT NULL PRIMARY KEY,
  descripcion VARCHAR(20) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.estado_ticket (
  estado_ticket INT NOT NULL PRIMARY KEY,
  descripcion VARCHAR(20) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.rol (
  rol INT NOT NULL PRIMARY KEY,
  descripcion VARCHAR(20) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.incidencia (
  tipo_incidencia INT NOT NULL PRIMARY KEY,
  descripcion VARCHAR(20) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.usuario (
  id_usuario INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  usuario VARCHAR(20) NOT NULL,
  contrasena VARCHAR(16) NOT NULL,
  nombre_completo VARCHAR(80) NOT NULL,
  cedula INT NOT NULL,
  email VARCHAR(30) NOT NULL,
  telefono INT NOT NULL,
  sexo VARCHAR(10) NOT NULL,
  pais VARCHAR(20) NOT NULL,
  provincia INT NOT NULL,
  canton INT NOT NULL,
  distrito INT NOT NULL,
  otras_senas VARCHAR(100),
  rol INT NOT NULL,
  fecha_registro datetime not null,
  estado_usuario int not null,
  terminos_condiciones bool,
  FOREIGN KEY fk_usuario_provincia(provincia) REFERENCES provincia(provincia),
  FOREIGN KEY fk_usuario_canton(canton) REFERENCES canton(canton),
  FOREIGN KEY fk_usuario_distrito(distrito) REFERENCES distrito(distrito),
  FOREIGN KEY fk_usuario_rol(rol) REFERENCES rol(rol),
  FOREIGN KEY fk_usuario_estado_usuario(estado_usuario) REFERENCES estado_usuario(estado_usuario))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.ticket (
  id_ticket INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  id_usuario INT NOT NULL,
  estado INT NOT NULL,
  tipo_incidencia INT NOT NULL,
  prioridad INT NOT NULL,
  titulo VARCHAR(20) NOT NULL,
  descripcion VARCHAR(200) NOT NULL,
  comentarios_usuario VARCHAR(200) NOT NULL,
  fecha_registro_usuario DATETIME NOT NULL,
  fecha_registra_tecnico DATETIME NOT NULL,
  id_tecnico INT NOT NULL,
  comentario_tecnico VARCHAR(200) NOT NULL,
  FOREIGN KEY fk_ticket_usuario(id_usuario) REFERENCES usuario(id_usuario),
  FOREIGN KEY fk_ticket_estado(estado) REFERENCES estado_ticket(estado_ticket),
  FOREIGN KEY fk_ticket_incidencia(tipo_incidencia) REFERENCES incidencia(tipo_incidencia),
  FOREIGN KEY fk_ticket_prioridad(prioridad) REFERENCES prioridad(prioridad),
  FOREIGN KEY fk_ticket_tecnico(id_tecnico) REFERENCES usuario(id_usuario))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.adjuntos_cliente (
  id_adjunto INT NOT NULL PRIMARY KEY,
  id_ticket INT NOT NULL,
  id_usuario INT NOT NULL,
  archivo VARCHAR(200) not null,
  FOREIGN KEY fk_adjunto_cliente_ticket(id_ticket) REFERENCES ticket(id_ticket),
  FOREIGN KEY fk_adjunto_cliente_usuario(id_usuario) REFERENCES usuario(id_usuario)
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

create table sistema_incidentes.adjuntos_tecnico (
  id_adjunto INT NOT NULL PRIMARY KEY,
  id_ticket INT NOT NULL,
  id_tecnico INT NOT NULL,
  archivo VARCHAR(200) not null,
  FOREIGN KEY fk_adjunto_tecnico_ticket(id_ticket) REFERENCES ticket(id_ticket),
  FOREIGN KEY fk_adjunto_tecnico_usuario(id_tecnico) REFERENCES usuario(id_usuario)
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


ALTER TABLE `sistema_incidentes`.`provincia` 
CHANGE COLUMN `provincia` `provincia` INT NOT NULL AUTO_INCREMENT ;
