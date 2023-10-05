<?php
include_once(__DIR__ . "/../../controller/CursoController.php");

$cursoCont = new CursoController();
$cursos = $cursoCont->listar();

?>

<?php
include_once(__DIR__ . "/../include/header.php");
?>

<h3>Inserir Aluno</h3>
<form method="POST" action="">
    <div>
        <label for="inputNome"> Nome:</label>
            <input type="text" name="nome" id="inputNome"/>
    </div>
    <div>
        <label for="inputIdade"> Idade:</label>
            <input type="number" name="idade" id="inputIdade" style="width: 100px;"/>
    </div>
    <div>
    <label for="inputEstrang"> Estrangeiro</label>
        <select name="estrang" id="inputEstrang" > 
            <option value="">------ Selecione ------ </option>
            <option value="S">Sim</option>
            <option value="N">Não</option>
        </select>
    </div>

    <label for="inputCurso"> Curso</label>
        <select name="curso" id="inputCurso" > 
            <option value="">------ Selecione ------ </option>
           
            <?php foreach($cursos as $c): ?>
                <option value="<?= $c->getId() ?>"> <?= $c->getNome() ?> </option>
            <?php endforeach; ?>
        </select>
    </div>
<br>
    <button type="submit">Gravar</button>
    <button type="reset">Limpar</button>
    
    <input type="hidden" name="submetido"/>

</form>
<a href="listar.php">Voltar</a>

<?php
include_once(__DIR__. "/../include/footer.php");
?>