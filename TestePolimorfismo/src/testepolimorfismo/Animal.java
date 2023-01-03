
package testepolimorfismo;

public abstract class Animal {
    protected String nome;
    protected double peso;
    protected double velocidade;

    public Animal(String nome, double peso, double velocidade) {
        this.nome = nome;
        this.peso = peso;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public void movimentar(double distancia){
        double tempo = distancia / this.velocidade;
        System.out.println("Animal gastou: "+tempo+" seg");
        //a subclasse não é obrigada a implemntar
    }
    public abstract void comer(double quantAlimento);
        
    }
