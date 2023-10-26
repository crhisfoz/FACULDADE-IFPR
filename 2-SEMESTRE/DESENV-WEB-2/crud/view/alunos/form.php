<?php
include_once(__DIR__ . "/../../controller/CursoController.php");

$cursoCont = new CursoController();
$cursos = $cursoCont->listar();

?>

<?php
include_once(__DIR__ . "/../include/header.php");
?>

<h3> <?php echo($aluno && $aluno->getId() > 0 ? 'Alterar' : 'Inserir') ?> Aluno</h3>
<form method="POST" action="">
    <div>
        <label for="inputNome"> Nome:</label>
            <input type="text" name="nome" id="inputNome"
            value="<?php echo ($aluno ? $aluno->getNome() : ' ' )?> "
            />
    </div>
    <div>
        <label for="inputIdade"> Idade:</label>
            <input type="number" name="idade" id="inputIdade" style="width: 100px;"
            value="<?php echo ($aluno ? $aluno->getIdade() : ' ' )?>" >
    </div>
    <div>
    <label for="inputEstrang"> Estrangeiro</label>
        <select name="estrang" id="inputEstrang" > 
            <option value="">------ Selecione ------ </option>
            <option value="S"
            <?php echo ($aluno && $aluno->getEstrangeiro() == 'S' ? 'selected' : ' ') ?>
            >Sim </option>
            <option value="N"
            <?php echo ($aluno && $aluno->getEstrangeiro() == 'N' ? 'selected' : ' ') ?>
            > Não </option>
        </select>
    </div>

    <label for="inputCurso"> Curso</label>
        <select name="curso" id="inputCurso" > 
            <option value="">------ Selecione ------ </option>
           
            <?php foreach($cursos as $c): ?>
                <option value="<?= $c->getId() ?>"
                <?php if($aluno && $aluno->getCurso() && $aluno->getCurso()->getId() == $c->getId())
                echo 'selected';
                ?>
                > <?= $c->getNome() ?> </option>
            <?php endforeach; ?>
        </select>
    </div>
<br>
    <button type="submit">Gravar</button>
    <button type="reset">Limpar</button>
    
    <input type="hidden" name="id_aluno" value="<?php echo($aluno ? $aluno->getId() : '' ) ?>"/>
    <input type="hidden" name="submetido" value="1"/>

</form>

<?php if($msgErros) : ?>
    <div style="color: red;">
    <?= $msgErros ?>
    </div>
<?php endif; ?> 

<a href="listar.php">Voltar</a>

<?php
include_once(__DIR__. "/../include/footer.php");
?>