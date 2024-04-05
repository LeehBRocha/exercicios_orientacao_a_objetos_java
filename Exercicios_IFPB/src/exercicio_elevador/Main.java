package exercicio_elevador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevador caso = new Elevador(10, 12);
        Scanner input = new Scanner(System.in);
        System.out.println("1 = ligado | 0 = desligado\nDeseja ligar o elevador?");
        caso.setLigado(input.nextInt());
        if(caso.getLigado() == 1){
            while (caso.getLigado() == 1) {
            
                for (int i=0; i < 6; i++){
                    caso.entrar();
                }
                for (int i=0; i < 8; i++){
                    caso.subir();
                }
                for (int i=0; i < 3; i++){
                    caso.descer();
                }

                System.out.println("===============================\nSTATUS DO ELEVADOR:\n1.Quantidade de pessoas: "+caso.getPessoas()+"\n2.Andar atual: "+caso.getAndar()+"\n3.Capacidade maxima: "+caso.getCapacidade()+"\n4.Quantidade de andares: "+caso.getQuantidadeAndares());
                System.out.println("===============================\n0 = desligado | 1 = ligado\nDeseja desligar o elevador?");
                caso.setLigado(input.nextInt());

            }
        }
        System.out.println("==============================="+caso.desligado());
    }
}
