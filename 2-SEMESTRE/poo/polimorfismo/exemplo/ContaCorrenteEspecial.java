public class ContaCorrenteEspecial extends ContaCorrente {

    //polimorfismo de sobreposição ou por herança( override)

    @Override
    public boolean sacar(float saque) {
        boolean resultado = false;
        float taxa = 0.003f;
        if (this.getSaldo() >= (saque + (saque * taxa))) {
            this.setSaldo(this.getSaldo() - ((saque * taxa) + saque));
            resultado = true;
        }
        return resultado;
    }

    public boolean sacar(float saque, float taxa) {
        boolean resultado = false;
        if (this.getSaldo() >= (saque + (saque * taxa))) {
            this.setSaldo(this.getSaldo() - ((saque * taxa) + saque));
            resultado = true;
        }
        return resultado;
    }
}
