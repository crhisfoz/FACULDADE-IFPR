public class Circulo implements FormaGeometrica {
    private float pi = 3.14f;
    private float raio;

    public Circulo(float raio){
        this.raio = raio;

    }

    public float getPi() {
        return pi;
    }


    public float getRaio() {
        return raio;
    }
    
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public float calcularArea() {
        return this.raio * this.pi;
    }

    
}
