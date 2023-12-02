create database Farmacia;
use Farmacia;

CREATE TABLE Fornecedores (
    IDFornecedor INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(255),
    CNPJouCPF VARCHAR(18),
    Telefone varchar (20),
    Email VARCHAR(255),
    Endereco VARCHAR(255),
    Numero varchar(10),
    Bairro varchar(100),
    Cidade varchar(100),
    UF Varchar(2),
    CEP VARCHAR(10)
);

CREATE TABLE Produto (
    IDProduto INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(255),
    Preco DECIMAL(10, 2),
    Estoque integer,
    Categoria VARCHAR(100),
    IDFornecedor integer,
	FOREIGN KEY (IDFornecedor) REFERENCES Fornecedores(IDFornecedor)
);

CREATE TABLE Cliente (
    IDCliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(255),
    CPF VARCHAR(18),
    Datanasc date,
    Genero varchar(10),
    Telefone VARCHAR(20),
    Email VARCHAR(255),
    Endereco VARCHAR(255),
    Numero varchar(10),
    Bairro varchar(100),
    Cidade varchar(100),
    UF Varchar(2),
    CEP VARCHAR(10)
);

CREATE TABLE Funcionarios (
    IDFuncionario INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(255),
    Cargo VARCHAR(255)
);

CREATE TABLE TiposExames (
    IDTipoExame INTEGER PRIMARY KEY AUTO_INCREMENT,
    NomeTipo VARCHAR(255)
);

CREATE TABLE ExamesETestes (
    IDExame INTEGER PRIMARY KEY AUTO_INCREMENT,
    NomeExame VARCHAR(255),
    TipoExame INTEGER,
    PrecoExame DECIMAL(10, 2),
    DataExame DATE,
    IDFuncionarioResponsavel INTEGER,
    IDCliente INTEGER,
    FOREIGN KEY (TipoExame) REFERENCES TiposExames(IDTipoExame),
    FOREIGN KEY (IDFuncionarioResponsavel) REFERENCES Funcionarios(IDFuncionario),
    FOREIGN KEY (IDCliente) REFERENCES Cliente(IDCliente)
);

INSERT INTO Funcionarios (Nome, Cargo) VALUES
('João Silva', 'Farmacêutico'),
('Maria Oliveira', 'Atendente'),
('Carlos Santos', 'Gerente'),
('Fernanda Lima', 'Caixa'),
('Paulo Camargo', 'Atendente'),
('Pedro Costa', 'Auxiliar');

INSERT INTO TiposExames (NomeTipo) VALUES
('Exame de Sangue'),
('Teste de Glicose'),
('Hemogramas'),
('Teste de Gravidez'),
('Exame de Colesterol');