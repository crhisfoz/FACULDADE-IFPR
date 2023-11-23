<?php
//Serviço para login

require_once(__DIR__ . "/../model/Usuario.php");

class LoginService
{

    public function validarDados($usuario, $senha)
    {
        $erros = array();

        //Validar se o campo usuário foi preenchido
        if (!$usuario)
            array_push($erros, "Informe o usuário!");

        //Validar se o campo senha foi preenchido
        if (!$senha)
            array_push($erros, "Informe a senha!");

        return $erros;
    }

    public function salvarUsuarioSessao(Usuario $usuario)
    {
        session_start();
        $_SESSION['USUARIO_ID'] = $usuario->getId();
        $_SESSION['USUARIO_NOME'] = $usuario->getNome();
    }

    //Retorna o nome do usuário logado no sistema
    public function getNomeUsuarioSessao()
    {
        $nomeUsuario = "";
        //carregar nome do usuário a partir da sessão
        if (session_status() != PHP_SESSION_ACTIVE) {
            session_start();
        }
        if (isset($_SESSION['USUARIO_NOME'])) {
            $nomeUsuario = $_SESSION['USUARIO_NOME'];
        }
        return $nomeUsuario;
    }

    public function excluirUsuarioSessao()
    {
        session_start();
        //limpar todos os dados da sessão
        session_unset();
        session_destroy();
    }
}
