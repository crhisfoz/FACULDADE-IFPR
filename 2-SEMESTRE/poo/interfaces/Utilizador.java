public class Utilizador {
    public static void main(String[] args) {
        System.out.println("Relógio de pulso");
        RelogioDePulso rp = new RelogioDePulso();
        System.out.println(rp.getHoras());
        System.out.println(rp.iniciarCronometro());

        // Por padrão, não se pode instanciar uma interface, a menos que se faça na hora
        // uma implementação dos métodos
        // recurso com uso mais restrito
        Relogio r = new Relogio() {
            public String getHoras() {
                return "outro horário...";
            }
        };
        System.out.println(r.getHoras());

        System.out.println("Rádio Relógio");
        RadioRelogio rr = new RadioRelogio();
        rr.ligar();
        rr.getHoras();
        rr.trocarEstacao(110.7f);
        rr.desligar();
    }

}
