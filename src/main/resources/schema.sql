--docker run --name dockerdb -e "MYSQL_ROOT_PASSWORD=pass" -e "MYSQL_DATABASE=clubesdb" -p 3306:3306 -d mariadb --log-bin --binlog-format=MIXED
drop table if exists clubesdb.club;

create table clubesdb.club (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);