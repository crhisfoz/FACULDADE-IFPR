public class Meses {
    String[] nomesMeses = new String[12];

    //Método constructor
    //Executado automaticamente sempre que se cria um objeto de classe
    //Não tem tipo de retorno e mesmo nome da classe
    public Meses(){
        atribuirValores();
    }

    private void atribuirValores() {
        nomesMeses[0] = "Janeiro";
        nomesMeses[1] = "Fevereiro";
        nomesMeses[2] = "Março";
        nomesMeses[3] = "Abril";
        nomesMeses[4] = "Maio";
        nomesMeses[5] = "Junho";
        nomesMeses[6] = "Julho";
        nomesMeses[7] = "Agosto";
        nomesMeses[8] = "Setembro";
        nomesMeses[9] = "Outubro";
        nomesMeses[10] = "Novembro";
        nomesMeses[11] = "Dezembro";
    }

    public String pegarNomeMeses(int num) {
        if ((num < 1) || (num > 12)) {
            return "";
        } else {
            return nomesMeses[num - 1];
        }

    }
}
