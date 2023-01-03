
package testepolimorfismo;


public class Passarinho extends Animal {
    private boolean canta;

    public Passarinho(boolean canta, String nome, double peso, double velocidade) {
        super(nome, peso, velocidade);
        this.canta = canta;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    /*/@Override
    public void movimentar(double distancia){
        double tempo = distancia / super.velocidade;
        System.out.println("O passarinho"+super.nome+ "demora: "+tempo);
        for(int i = 0; i < tempo;i++){
            System.out.println("v ");
        }
        System.out.println("");
    }
    public void movimentar(double distancia, double impuls){
    double tempo = distancia / (super.velocidade + impuls);
        
        System.out.println("O ");
    }/*/

    @Override
    public void comer(double quantAlimento) {
        System.out.println("Bica Bica Bica 0> 0> 0>");
    }
    public abstract void dormir(double horas);
    
}
