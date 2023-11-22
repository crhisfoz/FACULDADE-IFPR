<?php
include_once(__DIR__ . "/../../controller/LocacaoController.php");
$locacaoCont = new LocacaoController();
$locacoes = $locacaoCont->listar();
?>

<?php include_once(__DIR__ . "/../include/header.php"); ?>

<div class="container">
    <h3 class="mt-3">Listagem de Locações Realizadas</h3>
    <div class="mb-3">
        <a href="inserir.php" class="btn btn-primary">Inserir</a>
    </div>

    <table class="table table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
                <th>Local</th>
                <th>Data</th>
                <th>Hora</th>
                <th>Veiculo</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            <?php foreach ($locacoes as $l) : ?>
                <tr>
                    <td><?= $l->getId() ?></td>
                    <td><?= $l->getCliente()->getNome() ?></td>
                    <td><?= $l->getCliente()->getCpf() ?></td>
                    <td><?= $l->getLocal() ?></td>
                    <td><?= $l->getData() ?></td>
                    <td><?= $l->getHora() ?></td>
                    <td><?= $l->getCliente()->getVeiculo()->getModelo() ?></td>
                    <td>
                        <a href="alterar.php?id=<?= $l->getId() ?>" class="btn btn-warning btn-sm">
                            Editar
                        </a>
                        <a href="excluir.php?id=<?= $l->getId() ?>" class="btn btn-danger btn-sm" onclick="return confirm('Confirma a exclusão?')">
                            Excluir
                        </a>
                    </td>
                </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
</div>

<?php include_once(__DIR__ . "/../include/footer.php"); ?>
