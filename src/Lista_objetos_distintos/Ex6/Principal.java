package Lista_objetos_distintos.Ex6;

import java.util.ArrayList;

public class Principal {
    //Crie uma classe ContaBancaria com propriedades
    // como número da conta e saldo. Em seguida, crie uma lista de contas bancárias
    // com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

    public static void main(String[] args) {
        ArrayList<ContaBancaria>listaContas = new ArrayList<>();

        var conta1 = new ContaBancaria(123456,50);
        var conta2 = new ContaBancaria(123344,20);
        var conta3 = new ContaBancaria(113344,100);

        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaSaldoMaior = listaContas.get(0);
        for (ContaBancaria conta:listaContas){
            if (conta.getSaldo() > contaSaldoMaior.getSaldo()){
                contaSaldoMaior = conta;
            }
        }

        System.out.println("A conta com maior saldo: \nNúmero: "+ contaSaldoMaior.getNumero() + "\nSaldo: " + contaSaldoMaior.getSaldo());

    }

}
