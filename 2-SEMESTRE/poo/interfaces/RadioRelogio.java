public class RadioRelogio implements Radio, Relogio {

    public String getHoras() {
        return "Tarde da noite...";
    }

    public void ligar() {
        System.out.println("Rádio ligado");

    }

    public void desligar() {
        System.out.println("Rádio Desligado");

    }

    public void trocarEstacao(float estacao) {
        System.out.println("Mudando frequencia para " + estacao);

    }

}
