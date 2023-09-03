package domain;
    

public class Lagarto implements Algoritmo{

    @Override
    public void excutar(TipoAlgoritmo tipo) {
        switch(tipo){
            case LAGARTO-> System.out.println("Perdeu! Lagarto come o Papel");

            case TESOURA-> System.out.println("Ganhou! Tesoura corta o Papel");

            case PEDRA-> System.out.println("Ganhou! Papel embrulha Pedra");
            
            case SPOCK-> System.out.println("Ganhou! Papel refuta o Spock");

            default -> System.out.println("Empatou! Papel empata com Papel");
        }
        
    }
    
}


