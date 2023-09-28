<?php
include_once(__DIR__ . "/../../controller/AlunoController.php");
$alunoCont = new AlunoControler();
$alunos = $alunoCont->listar();

?>
<?php
include_once(__DIR__ . "/../include/header.php");
?>

<h3>Listagem de Alunos</h3>
<div>
    <a href="inserir.php">Inserir</a>
</div>
<table border="1">
 <thead>
    <tr>
        <td>ID</td>
        <td>Nome</td>
        <td>Idade</td>
        <td>Estrangeiro</td> 
        <td>Curso</td>
        <td></td>
        <td></td>
    </tr>
    <tbody>
        <tr>
        <?php foreach($alunos as $a): ?>
        <td><?= $a->getId() ?></td>
        <td><?= $a->getNome() ?></td>
        <td><?= $a->getIdade() ?></td>
        <td><?= $a->getEstrangeiroDesc() ?></td>
        <td><?= $a->getCurso()->getNome() ?></td>
        <td></td>
        <td></td>
        </tr>
        <?php endforeach; ?>
    </tbody>
 </thead>
</table>  
<?php
include_once(__DIR__. "/../include/footer.php");
?>