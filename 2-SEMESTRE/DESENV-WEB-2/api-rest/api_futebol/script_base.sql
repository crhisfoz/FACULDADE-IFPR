-- Active: 1695857830734@@127.0.0.1@3306@conexao_bd
use conexao_bd;
CREATE TABLE clubes (
    id INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(70) NOT NULL,
    cidade VARCHAR(70) NOT NULL,
    imagem VARCHAR(1000) NOT NULL,
    CONSTRAINT pk_clubes PRIMARY KEY (id)
);

/* INSERTs clubes */
INSERT INTO clubes (nome, cidade, imagem) 
VALUES ('Grêmio', 'Porto Alegre', 'https://static.dicionariodesimbolos.com.br/upload/53/e3/simbolo-do-gremio-1_xl.jpeg');

INSERT INTO clubes (nome, cidade, imagem) 
VALUES ('Internacional', 'Porto Alegre', 'https://logodownload.org/wp-content/uploads/2015/05/internacional-porto-alegre-logo-escudo-4.png');