use dbLocadora;

select * from tbCliente;

select * from tbFilme WHERE codigo_filme = 001;

select * from tbTitulo;

select * from tbEmprestimoDevolucao WHERE codigo_cli = 002;

select * from tbClasse WHERE nome_classe = 'lancamento';

SELECT tc.nome_cli
FROM tbCliente AS tc
JOIN tbEmprestimoDevolucao AS ted ON tc.codigo_cli = ted.codigo_cli
WHERE ted.codigo_cli = '001';
