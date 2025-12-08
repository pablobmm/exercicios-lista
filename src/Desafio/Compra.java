package Desafio;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private Double valor;

    public Compra(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.getDescricao() + " - " + this.getValor();
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }


}
