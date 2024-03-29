-- Active: 1695857830734@@127.0.0.1@3306
USE conexao_bd;

CREATE TABLE locacao(
   id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
   local VARCHAR(70) NOT NULL,
   data VARCHAR(70) NOT NULL,
   hora VARCHAR(70) NOT NULL,
   id_cliente int NOT NULL
);

CREATE TABLE clientes(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    id_veiculo int NOT NULL
);

CREATE TABLE veiculos (
     id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, 
     modelo VARCHAR(70) NOT NULL,
     categoria VARCHAR(70) NOT NULL,
     marca VARCHAR(70) NOT NULL
);

INSERT INTO veiculos (modelo, categoria, marca) VALUES
   ('Tiggo 8', 'Automático', 'caoa'),
   ('Tiggo 7', 'Automático', 'caoa'),
   ('Arizzo 6', 'Automático', 'caoa'),
   ('Cruze', 'Automático', 'Chevrolet'),
   ('Nissan Rogue', 'Automático', 'Nissan'),
   ('Onix', 'Compacto', 'Chevrolet'),
   ('Prisma', 'Compacto', 'Chevrolet'),
   ('Spark', 'Compacto', 'Chevrolet'),
   ('Ford Ka', 'Compacto', 'Ford'),
   ('Focus', 'Compacto', 'Ford'),
   ('Onix Joy', 'Econômico', 'Chevrolet'),
   ('Siena', 'Econômico', 'Fiat'),
   ('Malibu', 'Executivo', 'Chevrolet'),
   ('Cronos', 'Executivo', 'Fiat'),
   ('Fusion', 'Executivo', 'Ford'),
   ('Argo', 'Hatch', 'Fiat'),
   ('Mobi', 'Hatch', 'Fiat'),
   ('Cruze Hatch', 'Hatch', 'Chevrolet'),
   ('Kwid', 'Hatch', 'Renault'),
   ('Gol', 'Hatch', 'Volkswagen'),
   ('Picanto', 'Hatch', 'Kia'),
   ('Hb20', 'Hatch', 'Hyundai'),
   ('Spin', 'Minivan', 'Chevrolet'),
   ('Doblô', 'Minivan', 'Fiat'),
   ('Tucson', 'Minivan', 'Hyundai'),
   ('SpaceFox', 'Minivan', 'Volkswagen'),
   ('Duster', 'Minivan', 'Renault'),
   ('Toro', 'Pick-up', 'Fiat'),
   ('Cruze Sedan', 'Sedan', 'Chevrolet'),
   ('Onix Sedan', 'Sedan', 'Chevrolet'),
   ('Grand Siena', 'Sedan', 'Fiat'),
   ('Ford Ka Sedan', 'Sedan', 'Ford'),
   ('Hb20S', 'Sedan', 'Hyundai'),
   ('Cerato', 'Sedan', 'Kia'),
   ('Logan', 'Sedan', 'Chevrolet'),
   ('Tracker', 'SUV', 'Chevrolet'),
   ('Trailblazer', 'SUV', 'Chevrolet'),
   ('Toro', 'SUV', 'Fiat'),
   ('Sportage', 'SUV', 'Kia'),
   ('Strada', 'SUV', 'Fiat'),
   ('EcoSport', 'SUV', 'Ford');


select * from veiculos;
