import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//Crie uma classe Pessoa com atributos como nome, idade, e
// um método toString que represente esses atributos.
//No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
//Adicione pelo menos três pessoas à lista utilizando o método add.
//Imprima o tamanho da lista utilizando o método size.
//Imprima a primeira pessoa da lista utilizando o método get.
//Imprima a lista completa

        var pessoa1 = new Pessoa();
        pessoa1.setNome("Pablo");
        pessoa1.setIdade(22);
        var pessoa2 = new Pessoa();
        pessoa2.setNome("Antonio");
        pessoa2.setIdade(32);
        var pessoa3 = new Pessoa();
        pessoa3.setNome("Rafael");
        pessoa3.setIdade(40);
        ArrayList<Pessoa>listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size() + " pessoas.");
        System.out.println("Primeira pessoa da lista: "+ listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);
    }
}