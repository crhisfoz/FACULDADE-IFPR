use conexao_bd;

CREATE TABLE veiculos_api (
    id INTEGER NOT NULL AUTO_INCREMENT,
    modelo VARCHAR(70) NOT NULL,
    categoria VARCHAR(70) NOT NULL,
    marca VARCHAR(70) NOT NULL,
    potencia VARCHAR(70) NOT NULL,
    cambio VARCHAR(70) NOT NULL,
    cor VARCHAR(70) NOT NULL,
    CONSTRAINT pk_clubes PRIMARY KEY (id)
);

/* INSERTs clubes */

INSERT INTO veiculos_api (modelo, categoria, marca, potencia, cambio, cor) VALUES
   ('Tiggo 8', 'Sedan', 'Caoa', '200cv', 'automatico', 'preto'),
   ('Tiggo 7', 'Sedan', 'Caoa', '187cv', 'automatico', 'preto'),
   ('Arizzo 6', 'Compacto', 'Caoa', '160hp', 'automatico', 'prata'),
   ('Cruze', 'Sedan', 'Chevrolet', '153hp', 'automatico', 'branco'),
   ('Nissan Rogue', 'Compacto', 'Nissan', '201cv', 'automatico', 'prata'),
   ('Onix', 'Compacto', 'Chevrolet', '116hp', 'manual', 'vermelho'),
   ('Prisma', 'Compacto', 'Chevrolet', '116hp', 'manual', 'chumbo'),
   ('Ford Ka', 'Compacto', 'Ford', '136cv', 'automatico', 'azul'),
   ('Focus', 'Compacto', 'Ford', '178cv', 'automatico', 'prata'),
   ('Onix Joy', 'Econômico', 'Chevrolet', '82hp', 'manual', 'prata');
