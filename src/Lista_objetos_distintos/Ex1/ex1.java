package Lista_objetos_distintos.Ex1;

import java.util.ArrayList;
//Crie um ArrayList de strings e utilize um
// loop foreach para percorrer e imprimir cada elemento da lista.
public class ex1 {
    public static void main(String[] args) {
        ArrayList<String>listaPessoas = new ArrayList<>();
        listaPessoas.add("Pablo");
        listaPessoas.add("Rafael");
        listaPessoas.add("Leandro");
        for (String pessoa:listaPessoas){
            System.out.println(pessoa);
        }
    }
}
