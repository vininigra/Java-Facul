
package domain;

public class Pedra implements Algoritmo{

    @Override
    public void excutar(TipoAlgoritmo tipo) {
        switch(tipo){
            case LAGARTO-> System.out.println("Ganha! Lagarto morre para a Pedra");

            case TESOURA-> System.out.println("Ganha! Tesoura amassa Tesoura");

            case PAPEL-> System.out.println("Perde! Papel embrulha Pedra");
            
            case SPOCK-> System.out.println("Perde! Pedra derrete a Pedra");

            default -> System.out.println("Empatou! Papel empata com Papel");
        }
        
    }

    
    
}
