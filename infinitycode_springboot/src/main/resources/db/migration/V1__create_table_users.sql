create table users(
    id bigserial primary key,
    email varchar(100) not null,
    password varchar(100) not null
);

create table commerce(
    id bigserial primary key,
    role varchar(100),
    foreign key (id) references users(id)
);

create table person(
    id bigserial primary key,
    foreign key (id) references users(id)
);