package Lista_objetos_distintos.Ex5;

public class Circulo implements Forma{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double area = pi * (this.raio * this.raio);
        return area;
    }
}
