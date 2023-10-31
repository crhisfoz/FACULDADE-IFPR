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
            <input placeholder="Data" />
            <input placeholder="Hora" />
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
            <select style="margin-bottom: 5px; text-align: center">
                <option value="">------ Selecione a Categoria ------ </option>
                <option>Automático</option>
                <option>Compacto</option>
                <option>Econômico</option>
                <option>Executivo</option>
                <option>Hatch</option>
                <option>Minivan</option>
                <option>Pick-Up</option>
                <option>Sedan</option>
                <option>Suv</option>
            </select>

            <select style="margin-bottom: 5px; text-align: center">
                <option value="">------ Selecione a Marca ------ </option>
                <option>Caoa</option>
                <option>Chevrolet</option>
                <option>Fiat</option>
                <option>Ford</option>
                <option>Hyundai</option>
                <option>Kia</option>
                <option>Renault</option>
                <option>Volkswagen</option>
            </select>
        </div>

    </div>

    <div>
        <select style="margin-bottom: 5px; text-align: center">
            <option value="">------ Selecione o Veículo ------ </option>
            <option>Aqui vai renderizar os veículos disponiveis de cada marca</option>
        </select>
    </div>
    <div class="row">
        <div class="col-6 d-flex justify-content-center">
        <div class="btn-group" style="width: 50%" >
        <button class="btn-danger" style="width: 30%; margin: 5px; border-radius: 5px">Limpar</button>
        <button class="btn-success" style="width: 30%; margin: 5px; border-radius: 5px" >Enviar</button>
    </div>

        </div>
   

    </div>
    
</form>

<?php
include_once(__DIR__ . "/../include/footer.php")
?>