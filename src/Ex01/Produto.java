package Ex01;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private Double preco;
    private Double qtde;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getQtde() {
        return qtde;
    }

    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "Produto: "+this.getNome()+ " Preço: " + this.getPreco() + " Quantidade em estoque: " + this.getQtde();
    }

    public static void main(String[] args) {
        ArrayList<Produto>Produto = new ArrayList<>();
        var produto1 = new Produto();
        produto1.setNome("Detergente");
        produto1.setPreco(5.90);
        produto1.setQtde(30.0);
        var produto2 = new Produto();
        produto2.setNome("Condicionador");
        produto2.setPreco(12.00);
        produto2.setQtde(40.0);
        var produto3 = new Produto();
        produto3.setNome("Vassoura");
        produto3.setPreco(12.00);
        produto3.setQtde(40.0);
        Produto.add(produto1);
        Produto.add(produto2);
        Produto.add(produto3);
        System.out.println("Tamanho da lista: " + Produto.size() + " produtos");
        System.out.println("Segundo produto da lista: "+ Produto.get(1).getNome());
        System.out.println(Produto);
    }


}
