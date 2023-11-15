<?php
include_once(__DIR__ . "/../../controller/VeiculoController.php");

$veiculoCont = new VeiculoController();
$carros = $veiculoCont->listar();

?>

<?php
include_once(__DIR__ . "/../include/header.php")
?>

<h1>Formulário de Locação</h1>
<h4>Faça sua Reserva</h4>
<form class="container" style="border: 1px solid #ccc; padding:10px;">
    <div class="row">
        <div class="col-6 " style="margin-bottom: 5px">
            <input class="form-control" placeholder="Digite o Local de retirada" />
        </div>
    </div>

    <div class="row">
        <div class=" col-6">
            <input placeholder="Data"
            type="text" 
            name="data"
            id="inputData"
            value="<?php echo($locacao ? $locacao->getData() : ' ') ?>"/>
            <input placeholder="Hora" />
            <input placeholder="Hora"
            type="text" 
            name="hora"
            id="inputHora"
            value="<?php echo($locacao ? $locacao->getHora() : ' ') ?>"/>
        </div>
    </div>

    <div class="row ">
        <div class="col-6">
            <label>Nome</label>
            <input class="form-control" type="text" />
        </div>
    </div>

    <div class="row" style="margin-bottom: 5px">
        <div class="col-4">
            <label>CPF</label>
            <input class="form-control" type="text" />
        </div>
    </div>

    <div class="row">
        <div class="col">
            <select style="margin-bottom: 5px; text-align: center"
            name="categoria" id="inputCategoria">
                <option value="">------ Selecione a Categoria ------ </option>
                <option value="A">Automático</option>
                <option value="C">Compacto</option>
                <option value="EC">Econômico</option>
                <option value="EX">Executivo</option>
                <option value="H">Hatch</option>
                <option value="M">Minivan</option>
                <option value="P">Pick-Up</option>
                <option value="SE">Sedan</option>
                <option value="SU" >Suv</option>
            </select>

            <select style="margin-bottom: 5px; text-align: center"
            name="marcar" id="inputMarcar">
                <option value="">------ Selecione a Marca ------ </option>
                <option value="C">Caoa</option>
                <option value="CH">Chevrolet</option>
                <option value="FI">Fiat</option>
                <option value="FO">Ford</option>
                <option value="H">Hyundai</option>
                <option value="K">Kia</option>
                <option value="R">Renault</option>
                <option value="V">Volkswagen</option>
            </select>
        </div>

    </div>

    <div>
    <select style="margin-bottom: 5px; text-align: center"
    name="veiculo" id="inputVeiculo">
    <option value="">------ Selecione o Veículo ------ </option>
    <?php foreach ($carros as $carro) : ?>
        <option value="<?= $carro->getId() ?>">
        <?=$carro->getModelo()?>
    </option>
    <?php endforeach; ?>
</select>
    </div>
    <div class="row">
        <div class="col-6 d-flex justify-content-center">
            <div class="btn-group" style="width: 50%">
                <button class="btn-danger" style="width: 30%; margin: 5px; border-radius: 5px">Limpar</button>
                <button class="btn-success" style="width: 30%; margin: 5px; border-radius: 5px">Enviar</button>
                <input type="hidden" name="submetido"/>
            </div>

        </div>


    </div>

</form>
<?php if($msgErros) : ?>
    <div style="color: red;">
    <?= $msgErros ?>
    </div>
<?php endif; ?> 

<a href="listar.php">Voltar</a>

<?php
include_once(__DIR__ . "/../include/footer.php")
?>