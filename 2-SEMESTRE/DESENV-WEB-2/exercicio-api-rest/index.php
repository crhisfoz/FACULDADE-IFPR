<?php
use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;
use Slim\Factory\AppFactory;

use App\Controller\VeiculoController;

require_once(__DIR__ . '/vendor/autoload.php');

//--------Habilita o framework Slim--------
$app = AppFactory::create();
$app->setBasePath("/api-veiculos"); //Adicionar o nome da pasta do projeto


//--------Opções do framework Slim--------
$app->addBodyParsingMiddleware(); //Disponibliza o conteúdo recebido no corpo da requisição no objeto Request
$app->addErrorMiddleware(true, true, true); //Retorna um erro do Framework caso não tratado


//--------Rotas disponiblizadas pela API--------

//Rotas de teste
$app->get('/', function (Request $request, Response $response, $args) {
    return $response;
});

$app->get('/olaNome/{nome}', function (Request $request, Response $response, $args) {
    $nome = $args['nome'];

    $response->getBody()->write("Seja bem vindo " . $nome);
    
    return $response;
});

//Chamar /olaNome2?nome=Crhistian
$app->get('/olaNome', function (Request $request, Response $response, $args) {
    $params = $request->getQueryParams();

    $nome = "Sem nome";
    if(isset($params['nome']))
        $nome = $params['nome'];

    $response->getBody()->write("Seja bem vindo " . $nome);
    
    return $response;
});

//Rotas de veiculos
//TODO adicionar as rotas
$app->get("/veiculos", VeiculoController::class . ":listar");
$app->get("/veiculos/{id}", VeiculoController::class . ":buscarPorId");
$app->post("/veiculos", VeiculoController::class . ":inserir");
$app->put("/veiculos/{id}", VeiculoController::class . ":atualizar");
$app->delete("/veiculos/{id}", VeiculoController::class . ":deletar");


//--------Executa o framework slim--------
$app->run();