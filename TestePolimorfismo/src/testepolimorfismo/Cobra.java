
package testepolimorfismo;


public class Cobra extends Animal{
    private boolean venenosa;

    public Cobra(boolean venenosa, String nome, double peso, double velocidade) {
        super(nome, peso, velocidade);
        this.venenosa = venenosa;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    @Override
    public void movimentar(double distancia) {
        double tempo = distancia /super.velocidade;
        System.out.println("A cobra "+super.nome + "demora: "+tempo);
        for(int i = 0; i < tempo;i++){
            System.out.println("~");
            
        }
    }

    @Override
    public void comer(double quantAlimento) {
        System.out.println("Dá o bote");
    }
        
}
