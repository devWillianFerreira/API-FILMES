CREATE TABLE filmes(
    id varchar(255) not null primary key,
    nome varchar(50) not null,
    descricao varchar(255) not null,
    avaliacao decimal(2,1) check (avaliacao >= 0 and avaliacao <= 5)
);