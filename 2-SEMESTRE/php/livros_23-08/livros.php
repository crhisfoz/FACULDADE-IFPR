<?php
ini_set('display_errors', 1);
error_reporting(E_ALL);
include_once("persistencia.php");

$id = vsprintf(
    '%s%s-%s-%s-%s-%s%s%s',
    str_split(bin2hex(random_bytes(16)), 4)
);

$livros = buscarDados();

if (isset($_POST['submetido'])) {

    $titulo = $_POST['titulo'];
    $genero = $_POST['genero'];
    $qtd_pag = $_POST['qtd_pag'];


    $livro = array('id' => $id, 'titulo' => $titulo, 'genero' => $genero, 'paginas' => $qtd_pag);

    array_push($livros, $livro);

    salvarDados($livros);
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Livros</title>
</head>

<body>

    <h1>Cadastro de livros</h1>
    <h3>Formulário de Livros</h3>
    <form action="" method="POST">
        <input type="text" name="titulo" placeholder="informe o titulo" />
        <br><br>

        <select name="genero">
            <option value="">---Selecione o gênero----</option>
            <option value="D">Drama</option>
            <option value="F">Ficção</option>
            <option value="R">Romance</option>
            <option value="O">Outro</option>
        </select>
        <br><br>
        <input type="number" name="qtd_pag" placeholder="informe a quantidade de páginas" />
        <br><br>
        <input hidden="" name="submetido" value="1" />
        <button type="submit">Gravar</button>
        <button type="reset">Limpar</button>

    </form>

    <h3>Listagem de Livros</h3>

    <table border= '1 '>
        <tr>
        <td>Título</td>
        <td>Genero</td>
        <td>Páginas</td>
        <td></td>
        </tr>
        <?php 
        foreach ($livros as $livro) : ?>
            <tr>
                <td><?= $livro['titulo'] ?> </td>
                <td><?php
                switch($livro['genero']) {
                    case 'D':
                        echo 'Drama';
                        break;
                    case 'F':
                        echo 'Ficção';
                        break;
                    case 'R':
                        echo 'Romance';
                        break;
                    default:
                    echo $livro['genero'] ;

                }?></td>
                <td><?= $livro['paginas'] ?></td>
                <td><a href="livros_del.php?id=<?= $livros['id'] ?>">Excluir</a></td>
            </tr>

        <?php endforeach; ?>
    </table>


</body>

</html>