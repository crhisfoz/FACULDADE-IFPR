public class Quadrado implements FormaGeometrica {
    private float lado1;
    private float lado2;

    public Quadrado( float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
   
    public float getlado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float calcularArea() {
        return this.lado1 * this.lado2;
    }

}
