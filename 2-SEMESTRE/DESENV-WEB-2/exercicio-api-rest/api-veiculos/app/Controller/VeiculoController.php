<?php

namespace App\Controller;

use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;

use App\Dao\VeiculoDAO;
use App\Mapper\VeiculoMapper;
use App\Service\VeiculoService;
use App\Util\MensagemErro;

use \PDOException;

class ClubeController {

	private $veiculoDao;
	private $veiculoMapper;
	private $veiculoService;

	public function __construct() {
		$this->veiculoDao = new VeiculoDAO();
		$this->veiculoMapper = new VeiculoMapper();
		$this->veiculoService = new VeiculoService();
	}

    public function listar(Request $request, Response $response, 
							array $args): Response {
		$clubes = $this->veiculoDao->list();

		$json = json_encode($clubes, 
					JSON_UNESCAPED_SLASHES|JSON_UNESCAPED_UNICODE);

		$response->getBody()->write($json); 
		return $response
				->withStatus(200) //OK
				->withHeader("Content-Type", "application/json"); 
    }

	public function buscarPorId(Request $request, 
				Response $response, array $args): Response {
		$id = $args["id"];
		$veiculo = $this->veiculoDao->findById($id);

		if($veiculo) {
			$json = json_encode($veiculo, 
						JSON_UNESCAPED_SLASHES|JSON_UNESCAPED_UNICODE);

			$response->getBody()->write($json);

			return $response
					->withHeader("Content-Type", "application/json")
					->withStatus(200); //OK
		}

		return $response->withStatus(404); //NOT FOUND
    }

	public function inserir(Request $request, 
				Response $response, array $args): Response {
		//Retorna o JSON da requisição no formato de array assoc
		$jsonArrayAssoc = $request->getParsedBody();
		$veiculo = 
			$this->veiculoMapper->mapFromJsonToObject($jsonArrayAssoc);

		//TODO - Validar os dados
		$erro = $this->veiculoService->validar($veiculo);
		if($erro){
			$jsonErro = MensagemErro::getJSONErro($erro, "", 400);
			$response->getBody()->write($jsonErro);
			return $response
			->withHeader("Content-type", "application/json")
			->withStatus(400); //BAD REQUEST
		};

		//Insere o registro do veiculo na base de dados
		try {
			$veiculo = $this->veiculoDao->insert($veiculo);
			$json = json_encode($veiculo, 
							JSON_UNESCAPED_SLASHES|JSON_UNESCAPED_UNICODE);

			$response->getBody()->write($json);
			return $response
					->withHeader("Content-Type", "application/json")
					->withStatus(201); //CREATED
		
		
		} catch(PDOException $ex) {
			//Em caso de erro ao inserir o veiculo, este bloco será executado
			$jsonErro = MensagemErro::getJSONErro("Erro ao inserir o veiculo!", $ex->getMessage());
			$response->getBody()->write($jsonErro);
			return $response
					->withHeader('Content-Type', 'application/json')
					->withStatus(500); //INTERNAL_SERVER_ERROR
		}
	}

	public function atualizar(Request $request, Response $response, array $args): Response {
		$id = $args['id'];
		$veiculo = $this->veiculoDao->findById($id);
		
		if($veiculo) { 
			//Carrega o veiculo que veio na requisição em formato JSON
			$clubeArrayAssoc = $request->getParsedBody(); //Retorna um array a partir do JSON
			$veiculo = $this->veiculoMapper->mapFromJsonToObject($clubeArrayAssoc);
			$veiculo->setId($id);

			//TODO - Validar os dados
			$erro = $this->veiculoService->validar($veiculo);
		if($erro){
			$jsonErro = MensagemErro::getJSONErro($erro, "", 400);
			$response->getBody()->write($jsonErro);
			return $response
			->withHeader("Content-type", "application/json")
			->withStatus(400); //BAD REQUEST
		};
			
			try {
				//Atualiza o veiculo no banco de dados
				$veiculo = $this->veiculoDao->update($veiculo);		

				$response->getBody()->write(json_encode($veiculo, JSON_UNESCAPED_SLASHES|JSON_UNESCAPED_UNICODE));
				return $response
						->withHeader('Content-Type', 'application/json')
						->withStatus(200); //OK
			
			} catch(PDOException $ex) {
				//Em caso de erro ao atualizar o veiculo, este bloco será executado
				$jsonErro = MensagemErro::getJSONErro("Erro ao atualizar o veiculo!", $ex->getMessage());
				$response->getBody()->write($jsonErro);
				return $response
						->withHeader('Content-Type', 'application/json')
						->withStatus(500); //INTERNAL_SERVER_ERROR
			}
		}

		return $response->withStatus(404); //NOT_FOUND
    }

	public function deletar(Request $request, Response $response, array $args): Response {
		$id = $args['id'];
		$veiculo = $this->veiculoDao->findById($id);
		
		if($veiculo) { 
			try {
				//Deleta do banco de dados
				$this->veiculoDao->deleteById($id);
				return $response->withStatus(200); //OK
			} catch(PDOException $ex) {
				
				//Em caso de erro ao atualizar o veiculo, este bloco será executado
				$jsonErro = MensagemErro::getJSONErro("Erro ao deletar o veiculo!", $ex->getMessage());
				$response->getBody()->write($jsonErro);
				return $response
						->withHeader('Content-Type', 'application/json')
						->withStatus(500); //INTERNAL_SERVER_ERROR
			}
		}

		return $response->withStatus(404); //NOT_FOUND
    }


}