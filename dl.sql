create table students
(
    id          serial
        constraint students_pk
            primary key,
    first_name  text,
    last_name   text,
    personal_no integer,
    email       text,
    birth_date  date
);

alter table students
    owner to user_1;

create table teachers
(
    id          serial
        constraint teachers_pk
            primary key,
    first_name  text,
    last_name   text,
    personal_no integer,
    email       text,
    birth_date  date
);

alter table teachers
    owner to user_1;

create table groups
(
    id       serial
        constraint groups_pk
            primary key,
    title    text,
    group_no integer
);

alter table groups
    owner to user_1;

