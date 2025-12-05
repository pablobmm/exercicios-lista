package Lista_objetos_distintos.Ex5;

//Crie uma interface Forma com um método calcularArea().
// Implemente a interface em duas classes, por exemplo, Circulo e Quadrado.
// Em seguida, crie uma lista de formas (objetos da interface Forma)
// e utilize um loop para calcular e imprimir a área de cada forma.

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Forma>listaFormas = new ArrayList<>();

        Forma forma1 = new Quadrado(4);
        Forma forma2 = new Circulo(6);
        Forma forma3 = new Circulo(3);

        listaFormas.add(forma1);
        listaFormas.add(forma2);
        listaFormas.add(forma3);

        for (Forma forma : listaFormas) {

            String nomeDaClasse = forma.getClass().getSimpleName();

            System.out.println("A área do " + nomeDaClasse + " é: " + forma.calcularArea());
        }

    }
}
