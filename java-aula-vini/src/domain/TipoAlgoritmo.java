package domain;

public enum TipoAlgoritmo {

    PAPEL(1),
    TESOURA(2), 
    PEDRA(3),
    LAGARTO(4),   
    SPOCK(5);

    private Integer id;
    TipoAlgoritmo(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public static TipoAlgoritmo getTipo(Integer pId){

       /*  Stream<T>.of(values())
        .filter(t -> t.getId().equals(pId))
        .findFirst()
        .orElseThrow(new RuntimeException())*/

        for(TipoAlgoritmo tipo: TipoAlgoritmo.values()){
            if(tipo.getId().equals(pId))return tipo;
        }

        throw new RuntimeException("Tipo algoritmo inválido");





    }
}
