<?php
$nome = "";
$idade = "";
$msgErro = "";

if (isset($_POST['submetido'])) {
    $nome = $_POST['nome'];
    $idade = $_POST['idade'];

    if (!trim($nome)) {
        $msgErro = "Informe o nome! ";
    } elseif (!trim($idade)) {
        $msgErro = "Informe a Idade! ";
    } else {
        echo $nome . " - " . $idade;
        $nome = "";
        $idade = "";

    }

}

?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Validação</title>
    <script src="validacao.js" defer></script>
</head>

<body>
    <h1>Formulário a validar </h1>
    <form method="POST">
        <input type="text" name="nome" placeholder="Nome:" id="nome" value="<?= $nome ?> "/>
        <br><br>
        <input type="number" name="idade" placeholder="Idade:" id="idade" value="<?= $idade ?>" />
        <br><br>

        <button type="submit"> Enviar</button>
        <input type="hidden" name="submetido" value="1" />

    </form>
    <div id="divMsg" style="color: red;"> <?= $msgErro ?> </div>


</body>

</html>