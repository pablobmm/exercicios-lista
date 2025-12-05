package Lista_objetos_distintos.Ex5;

public class Quadrado implements Forma{

    public double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        double area = lado*lado;
        return area;
    }
}
