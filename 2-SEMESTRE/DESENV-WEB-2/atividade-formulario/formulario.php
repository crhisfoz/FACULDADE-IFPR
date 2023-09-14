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
            <input type="text" placeholder="Digite a Marca do Veículo" name="mark" />
            <input type="text" placeholder="Digite o Modelo" name="model" />
            <input type="text" placeholder="Digite a Placa" name="plate" />
            <input type="text" placeholder="Digite a Cor" name="color" />
            <button type="submit" name="button_car">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="game">
            <input type="text" placeholder="Digite o nome do Jogo" name="title" />
            <input type="text" placeholder="Digite o estilo" name="style" />
            <span class="span">Multiplayer
                <input type="checkbox" name="mult" value="YES" />
            </span>
            <button type="submit" name="button_game">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="product">
            <input type="text" placeholder="Digite o Nome do Produto" name="productName" />
            <input type="number" placeholder="Digite o Preço" name="productPrice" />
            <button type="submit" name="button_prod">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="person">
            <input type="text" placeholder="Digite o nome da Pessoa" name="personName" />
            <input type="text" placeholder="Digite o cpf" name="cpf" />
            <input type="email" placeholder="Digite o email" name="email" />
            <button type="submit" name="button_person">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="tourist_pt">
            <input type="text" placeholder="Digite o nome do Ponto Turístico" name="touristName" />
            <input type="text" placeholder="Digite a Cidade" name="city" />
            <button type="submit" name="button_tourist">Gravar</button>
            <button type="reset">Limpar</button>
        </div>

        <div class="tipo_entidade" id="music">
            <input type="text" placeholder="Digite o nome da Música" name="musicName" />
            <input type="text" placeholder="Digite do Cantor/banda" name="singer" />
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
</body>

</html>