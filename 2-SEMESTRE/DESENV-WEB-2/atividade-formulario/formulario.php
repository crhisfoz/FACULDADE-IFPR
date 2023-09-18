<?php
include_once("buscarDados.php");
// $data = searchData();
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css" media="screen" />
    <script src="./form.js" defer></script>
    <title>Formulário</title>
</head>

<body>
    <h1>CADASTRAMENTO DE ENTIDADES</h1>
    <form action="persistencia.php" method="POST" class="form">
        <label>
            <h3>Informe o nome da Entidade</h3>
        </label>
        <select name="submit" onchange="showDivOption()" id="select">
            <option value=""> ------ Selecione a Entidade ------ </option>
            <option value="C">CARRO</option>
            <option value="G">JOGO</option>
            <option value="PD">PRODUTO</option>
            <option value="P">PESSOA</option>
            <option value="PT">PONTO TURÍSTICO</option>
            <option value="M">MÚSICA</option>
        </select>

        <!-- Campo de entrada oculto para armazenar o valor do botão clicado -->
        <input type="hidden" name="button_value" id="button_value" value="">

        <div class="tipo_entidade" id="car">
            <input type="text" placeholder="Digite a Marca do Veículo" name="mark" required />
            <input type="text" placeholder="Modelo" name="model"required/>
            <input type="text" placeholder="Placa" name="plate" required />
            <input type="text" placeholder="Cor" name="color" required/>
            <button type="submit" name="button_car">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="game">
            <input type="text" placeholder="Digite o nome do Jogo" name="title" required />
            <input type="text" placeholder="Digite o estilo" name="style"  required/>
            <span class="span">Multiplayer
                <input type="checkbox" name="mult" value="YES" />
            </span>
            <button type="submit" name="button_game">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="product">
            <input type="text" placeholder="Digite o Nome do Produto" name="productName" required />
            <input type="number" placeholder="Digite o Preço" name="productPrice" required />
            <button type="submit" name="button_prod">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="person">
            <input type="text" placeholder="Digite o nome da Pessoa" name="personName" required/>
            <input type="text" placeholder="Digite o cpf" name="cpf" required />
            <input type="email" placeholder="Digite o email" name="email" required/>
            <button type="submit" name="button_person">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="tourist_pt">
            <input type="text" placeholder="Digite o nome do Ponto Turístico" name="touristName" required />
            <input type="text" placeholder="Digite a Cidade" name="city" required/>
            <button type="submit" name="button_tourist">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="music">
            <input type="text" placeholder="Digite o nome da Música" name="musicName" required />
            <input type="text" placeholder="Digite do Cantor/banda" name="singer" required />
            <div class="music">
                <span id="idnovo">Rock <input type="checkbox" name="musicType" value="1" /> </span>
                <span>Sertanejo <input type="checkbox" name="musicType" value="2" /> </span>
                <span>Hip Hop <input type="checkbox" name="musicType" value="3" /> </span>
                <span>Samba/Pagode <input type="checkbox" name="musicType" value="4" /> </span>
                <span>Pop <input type="checkbox" name="musicType" value="5" /> </span>
            </div>
            <button type="submit" name="button_music">Gravar</button>
            <button type="reset">Limpar</button>
        </div>
    </form>
    <div id="result">
        <table id="data-table">
            <!-- Aqui serão exibidos os dados da seleção do usuário -->
        </table>
    </div>
</body>

</html>