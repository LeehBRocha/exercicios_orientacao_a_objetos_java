package exercicio_elevador;

public class Elevador {
    private int andar;
    private int capacidade;
    private int pessoas;
    private int quantidadeAndares;
    private int ligado;
    private int desligado;


    public Elevador(int quantidadeAndares, int capacidade, int ligado){
        this.quantidadeAndares = quantidadeAndares;
        this.capacidade = capacidade;
        this.ligado = ligado;
        this.pessoas = 0;
        this.andar = 0;
    }

    public int getLigado() {
        return ligado;
    }

    public void setLigado(int ligado) {
        this.ligado = ligado;
    }

    public int getQuantidadeAndares() {
        return quantidadeAndares;
    }

    public void setQuantidadeAndares(int quantidadeAndares) {
        this.quantidadeAndares = quantidadeAndares;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }  

    public void entrar(){
        int acrescentar = 0;
        if(this.pessoas <= this.capacidade){
            this.pessoas ++;
        }
    }

    public void sair (){
        if(this.pessoas != 0){
            this.pessoas --;
        }
    }

    public void subir(){
        if(this.andar != this.quantidadeAndares){
            this.andar ++;
            
        }
    }

    public void descer(){
        if(this.andar != 0){
            this.andar --;
            
        }
    }

    public int ligado(){
        if (this.ligado == 1){
            return 1;
        }
        return 0;
    }
    public int desligado(int desligado){
        if (this.desligado == 1){
            setLigado(0);
        }
        return this.ligado = 1;
    }

    public int getDesligado() {
        return desligado;
    }

    public void setDesligado(int
     desligado) {
        this.desligado = desligado;
    }







    
}
