<?php
use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;
use Slim\Factory\AppFactory;

use App\Controller\ClubeController;

require_once(__DIR__ . '/vendor/autoload.php');

//--------Habilita o framework Slim--------
$app = AppFactory::create();
$app->setBasePath("/api_futebol"); //Adicionar o nome da pasta do projeto


//--------Opções do framework Slim--------
$app->addBodyParsingMiddleware(); //Disponibliza o conteúdo recebido no corpo da requisição no objeto Request
$app->addErrorMiddleware(true, true, true); //Retorna um erro do Framework caso não tratado


//--------Rotas disponiblizadas pela API--------

//Rotas de teste
$app->get('/', function (Request $request, Response $response, $args) {
    $response->getBody()->write("Olá mundo");
    return $response;
});

$app->get('/olaNome/{nome}', function (Request $request, Response $response, $args) {
    $nome = $args['nome'];
    $response->getBody()->write("Seja bem vindo ". $nome);
    return $response;

});

//Chamar /olaNome2?nome=Daniel
$app->get('/olaNome', function (Request $request, Response $response, $args) {
    $params = $request->getQueryParams();
    $nome =  "Sem nome";
    if(isset($params['nome'])){
        $nome = $params['nome'];
    }
    $response->getBody()->write("Seja bem vindo ". $nome);
    return $response;
});

//Rotas de clubes
//TODO adicionar as rotas


//--------Executa o framework slim--------
$app->run();