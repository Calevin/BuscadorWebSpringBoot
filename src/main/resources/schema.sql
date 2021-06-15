--docker run --name dockerdb -e "MYSQL_ROOT_PASSWORD=pass" -e "MYSQL_DATABASE=clubesdb" -p 3306:3306 -d mariadb --log-bin --binlog-format=MIXED
drop table if exists club;
drop table if exists categoria;

create table categoria (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000)
);

create table club (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500),
    categoria_id int not null,
    foreign key (categoria_id) references categoria(id)
);