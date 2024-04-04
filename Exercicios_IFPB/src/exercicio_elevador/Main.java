package exercicio_elevador;

public class Main {
    public static void main(String[] args) {
        Elevador caso = new Elevador(10, 12);
        for (int i=0; i < 6; i++){
            caso.entrar();
        }
        for (int i=0; i < 8; i++){
            caso.subir();
        }
        for (int i=0; i < 3; i++){
            caso.descer();
        }
        System.out.println("\nSTATUS DO ELEVADOR:\n1.Quantidade de pessoas: "+caso.getPessoas()+"\n2.Andar atual: "+caso.getAndar()+"\n3.Capacidade maxima: "+caso.getCapacidade()+"\n4.Quantidade de andares: "+caso.getQuantidadeAndares()+"\n");
    }
}
