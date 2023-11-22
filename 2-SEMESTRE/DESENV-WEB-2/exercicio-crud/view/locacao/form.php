<?php
include_once(__DIR__ . "/../../controller/VeiculoController.php");
include_once(__DIR__ . "/../../model/Locacao.php");
include_once(__DIR__ . "/../../controller/ClienteController.php");

$clienteCont = new ClienteController();
$cliente = $clienteCont->listar();

$veiculoCont = new VeiculoController();
$carros = $veiculoCont->listar();

?>

<?php include_once(__DIR__ . "/../include/header.php") ?>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h1 class="text-center">Formulário de Locação</h1>
            <h3 class="text-center"><?= ($locacao && $locacao->getId() > 0 ? 'Alterar Reserva' : 'Inserir Reserva') ?></h3>

            <form style="border: 1px solid #ccc; padding:10px;" method="POST">

                <div class="row">
                    <div class="col-12 mb-3">
                        <label for="local" class="form-label"><b>Local</b></label>
                        <input class="form-control" id="local" placeholder="Digite o Local de retirada" name="local" value="<?= ($locacao ? $locacao->getLocal() : '') ?>" />
                    </div>
                </div>

                <div class="row">
                    <div class="col-6 mb-3">
                        <label for="inputData" class="form-label"><b>Data</b></label>
                        <input type="text" id="inputData" class="form-control" placeholder="Data" name="data" value="<?= ($locacao ? $locacao->getData() : '') ?>" />
                    </div>
                    <div class="col-6 mb-3">
                        <label for="inputHora" class="form-label"><b>Hora</b></label>
                        <input type="text" id="inputHora" class="form-control" placeholder="Hora" name="hora" value="<?= ($locacao ? $locacao->getHora() : '') ?>" />
                    </div>
                </div>

                <div class="row">
                    <div class="col-6 mb-3">
                        <label for="inputNome" class="form-label"><b>Nome</b></label>
                        <?php
                        if ($locacao && $locacao->getId() > 0) {
                            echo '<input 
            value="' . ($locacao ? $locacao->getCliente()->getNome() : "") . '"
            class="form-control"
            type="text" 
            name="cliente"
            placeholder="Nome"
            readonly
        />';
                        } else {
                            echo '<input 
            value="' . ($locacao ? $locacao->getCliente()->getNome() : "") . '"
            class="form-control"
            type="text" 
            name="cliente"
            placeholder="Nome"
        />';
                        }
                        ?>
                    </div>
                    <div class="col-6 mb-3">
                        <label for="inputCpf" class="form-label"><b>CPF</b></label>
                        <?php
                        if ($locacao && $locacao->getId() > 0) {
                            echo '<input 
            value="' . ($locacao ? $locacao->getCliente()->getCpf() : "") . '"
            class="form-control"
            type="text" 
            name="cpf"
            placeholder="CPF"
            readonly
        />';
                        } else {
                            echo '<input 
            value="' . ($locacao ? $locacao->getCliente()->getCpf() : "") . '"
            class="form-control"
            type="text" 
            name="cpf"
            placeholder="CPF"
        />';
                        }
                        ?>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="inputVeiculo" class="form-label"><b>Modelo</b></label>
                    <select class="form-control text-center" id="inputVeiculo" name="veiculo">
                        <option value="">------ Selecione o Veículo ------</option>
                        <?php foreach ($carros as $carro) : ?>
                            <option value="<?= $carro->getId() ?>" <?php if (
                                                                        $locacao && $locacao->getCliente() &&
                                                                        $locacao->getCliente()->getVeiculo() &&
                                                                        $locacao->getCliente()->getVeiculo()->getId() == $carro->getId()
                                                                    )
                                                                        echo 'selected';
                                                                    ?>>
                                <?= $carro->getModelo() ?>
                            </option>
                        <?php endforeach; ?>
                    </select>
                </div>


                <div class="text-center">
                    <button class="btn btn-danger" style="width: 30%; margin: 5px; border-radius: 5px" type="reset">Limpar</button>
                    <button class="btn btn-success" style="width: 30%; margin: 5px; border-radius: 5px" type="submit">Enviar</button>
                    <input type="hidden" name="submetido" />
                </div>

            </form>

            <?php if ($msgErros) : ?>
                <div style="color: red;">
                    <?= $msgErros ?>
                </div>
            <?php endif; ?>

            <a href="listar.php" class="btn btn-primary d-block mt-3 mx-auto">Voltar</a>
        </div>
    </div>
</div>

<?php include_once(__DIR__ . "/../include/footer.php") ?>