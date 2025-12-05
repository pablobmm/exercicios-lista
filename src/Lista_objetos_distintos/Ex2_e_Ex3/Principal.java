package Lista_objetos_distintos.Ex2_e_Ex3;


//2- Crie uma classe Animal e uma classe Cachorro que herda de Animal.
// Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.


//3- Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir
// que o objeto seja do tipo correto antes de fazer o casting.


public class Principal {
    public static void main(String[] args) {
        Animal animal = new Cachorro("valente",10);

       if (animal instanceof Cachorro){
           Cachorro cachorro1 = new Cachorro("valente",10);
       }else{
           System.out.println("o objeto não é um cachorro");
       }
    }
}
