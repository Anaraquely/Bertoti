drop database book;
create database book;
use book;
create table livro (
id int primary key auto_increment,
nome varchar(40), 
autor varchar(50),
data_lanc varchar (10)
);
-- Inserir um livro com nome, autor e data de lançamento específicos
INSERT INTO livro (nome, autor, data_lanc) VALUES ('Dom Quixote', 'Miguel de Cervantes', '1605-01-01');

-- Inserir um livro com nome e autor, sem especificar a data de lançamento
INSERT INTO livro (nome, autor) VALUES ('1984', 'George Orwell');

-- Inserir um livro com todas as informações especificadas
INSERT INTO livro (nome, autor, data_lanc) VALUES ('Cem Anos de Solidão', 'Gabriel García Márquez', '1967-05-30');

select*from livro;