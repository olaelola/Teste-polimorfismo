
package testepolimorfismo;

import java.util.Vector;

public class TestePolimorfismo {


    public static void main(String[] args) {
        Cobra coral = new Cobra(true, "Coral", 2, 0.3);
        
        coral.movimentar(3);
        
        Passarinho canarinho = new Passarinho(true, "Canarinho", 0.3, 1.5);
        //canarinho.movimentar(10,0.5);
        
         Passarinho papagaio = new Passarinho(true, "Papagaio", 0.4, 1.7);
        //canarinho.movimentar(10,0.5);
        
        papagaio.movimentar(15);
    }
    
}
