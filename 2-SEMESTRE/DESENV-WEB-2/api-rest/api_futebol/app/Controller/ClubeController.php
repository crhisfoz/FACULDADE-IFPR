<?php

namespace App\Controller;

use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;

use App\Dao\ClubeDAO;
use App\Mapper\ClubeMapper;
use App\Service\ClubeService;
use App\Util\MensagemErro;

use \PDOException;

class ClubeController {

	private $clubeDAO;
	private $clubeMapper;
	private $clubeService;

	public function __construct() {
		$this->clubeDAO = new ClubeDAO();
		$this->clubeMapper = new ClubeMapper();
		$this->clubeService = new ClubeService();
	}

    public function listar(Request $request, Response $response, array $args): Response {
		return $response
				->withStatus(404); //NOT_FOUND
    }

	public function buscarPorId(Request $request, Response $response, array $args): Response {
		return $response
				->withStatus(404); //NOT_FOUND
    }



}