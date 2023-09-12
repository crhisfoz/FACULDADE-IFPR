public class Retangulo implements FormaGeometrica {
    private float lado;
    private float base;

    public float getLado1() {
        return lado;
    }

    public void setLado1(float lado) {
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float calcularArea() {
        return this.lado * this.base;
    }
}
