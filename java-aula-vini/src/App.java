import java.util.Scanner;
import java.util.Random;

import domain.Algoritmo;
import domain.Jokenpo;
import domain.Papel;
import domain.Pedra;
import domain.Spock;
import domain.Lagarto;
import domain.Tesoura;
import domain.TipoAlgoritmo;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma das opções: ");
        System.out.println("PAPEL :1");
        System.out.println("TESOURA :2");
        System.out.println("PEDRA : 3");
        System.out.println("Lagarto : 4");
        System.out.println("SPOCK : 5");
        System.out.println();

        //TODO: Criar funcao para converter int em algoritmo

        Integer jogador = scanner.nextInt();
        Algoritmo algoritmo = getAlgoritmo(jogador);
    
        //TODO : Gerar jogada randomica e converter em um Enum
        Integer random = new Random().nextInt(5) + 1;
        TipoAlgoritmo computador = TipoAlgoritmo.getTipo(random);
        
        
        Jokenpo jokenpo = new Jokenpo();
        jokenpo.setAlgoritmo(algoritmo);

        jokenpo.Jogar(computador);

        scanner.close();
        
    }

    static Algoritmo getAlgoritmo(Integer id){
        TipoAlgoritmo tipo = TipoAlgoritmo.getTipo(id);
        switch(tipo){
            case PAPEL:
                return new Papel();
            case TESOURA:
                return new Tesoura();
            case LAGARTO:
                return new Lagarto();
            case SPOCK:
                return new Spock();
            case PEDRA:
                return new Pedra();
            default:
                throw new RuntimeException("Tipo invalido");
        }
    }
}
