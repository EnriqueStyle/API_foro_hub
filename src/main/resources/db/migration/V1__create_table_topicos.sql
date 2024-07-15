create table topicos (
  id BIGINT not null AUTO_INCREMENT,
  titulo varchar(100) not null unique,
  mensaje varchar(500) not null unique,
  autor varchar(100) not null,
  curso varchar(100) not null,
  fecha_creacion timestamp default current_timestamp,

  primary key (id)

);