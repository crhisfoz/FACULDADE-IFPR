<?php
class Connection
{
    private static $conn = null;

    public static function getConnection()
    {
        $host = "localhost";
        $dbname = "conexao_bd";
        $username = "root";
        $password = "root";
        
        if (self::$conn == null) {
            //Criar conexão
            $options = array(
                //Define o charset da conexão
                PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8",
                //Define o tipo do erro como exceção
                PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
                //Define o retorno das consultas como
                //array associativo (campo => valor)
                PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC
            );

            self::$conn = new PDO("mysql:host=$host;dbname=$dbname", "$username", "$password", $options);
        }
        return self::$conn;
    }
}
