package Logica;

public abstract class EjercicioIntegrador {
    public static void main(String[] args) {
        
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        
        charmander.atacarAraniazo();
        charmander.atacarLanzaLLamas();
        
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        
        pikachu.atacarAraniazo();
        pikachu.atacarImpacttrueno();
        
        
        


    }
}
