package exercicio_jogador;

public class Jogador{
    private String nome;
    private String posicao;
    private int anonascimento;
    private String nacionalidade;
    private double peso;
    private double altura;
    private int idade;
    private boolean aposentado;
    
    public Jogador(String nome, String posicao, int anonascimento, String nacionalidade, double peso, double altura) {
        this.nome = nome;
        this.posicao = posicao;
        this.anonascimento = anonascimento;
        this.nacionalidade = nacionalidade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getDatanascimento() {
        return anonascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.anonascimento = anonascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int calcularIdade(){
         int idade = 2024 - anonascimento;
         return idade;

    }

    public int jogadorAposentado(){
        if(this.posicao == "defesa" && this.idade < 40){
            int falta = 40 - idade;
            return falta;
        }else if(this.posicao == "meio-campo" && this.idade < 38) {
            int falta = 38 - idade;
            return falta;
        }else if (this.posicao == "atacante" && this.idade < 35){
            int falta = 35 - idade;
            return falta;
        }
        return 0;
            
        }


    public String imprimir(){
        return "Nome do jogador: "+this.nome+ "\nPosição: "+ posicao + "\nAno de nascimento: "+ anonascimento + "\nNacionalidade: " + nacionalidade + "\nPeso: "+peso+" kgs. \nAltura: "+altura+" metros\n";
    }
    
    }


