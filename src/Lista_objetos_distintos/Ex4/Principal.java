package Lista_objetos_distintos.Ex4;


import java.util.ArrayList;

//Crie uma classe Produto com propriedades como nome e preço.
// Em seguida, crie uma lista de produtos e utilize um
// loop para calcular e imprimir o preço médio dos produtos.
public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto>listaProdutos = new ArrayList<>();

        var produto1 = new Produto("Coca-Cola 1,5L",8.50);
        var produto2 = new Produto("Suco de laranja Xandô 1L",6.90);
        var produto3 = new Produto("Corona 355ml",7.90);
        var produto4 = new Produto("Arroz Camil 1kg",5.90);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);

        double somaPrecos = 0;
        for (Produto produto:listaProdutos){
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos/listaProdutos.size();

        System.out.printf("O preço médio da lista de produtos é: %.2f",precoMedio);
    }
}
