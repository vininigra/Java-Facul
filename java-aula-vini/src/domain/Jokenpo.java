package domain;

public class Jokenpo {

    private Algoritmo algoritmo;

    public void setAlgoritmo(Algoritmo algoritmo){
        this.algoritmo = algoritmo;
    }

    public void Jogar (TipoAlgoritmo tipo){
        algoritmo.excutar(tipo);
    }
    
    
}
