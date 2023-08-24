package domain;

public class Tesoura implements Algoritmo{

    @Override
    public void excutar(TipoAlgoritmo tipo) {
        switch(tipo){
            case LAGARTO-> System.out.println("Ganha! Lagarto come o Tesoura");

            case PAPEL-> System.out.println("Ganha! Tesoura corta o Papel");

            case PEDRA-> System.out.println("Perde! Tesoura amassa Tesoura");
            
            case SPOCK-> System.out.println("Perde! Tesoura derrete Tesoura");

            default -> System.out.println("Empatou! Tesoura empata com Tesoura");
        }
        
    }

    
    
}