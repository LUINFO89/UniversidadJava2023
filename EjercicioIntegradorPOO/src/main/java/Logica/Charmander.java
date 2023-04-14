package Logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    

    @Override
    protected void atacarplacaje() {
        System.out.println("Hola soy Charmander y tengo un ataque de placaje ");    
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y tengo un ataque de araniazo ");    
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola soy Charmander y tengo un ataque de Mordizco ");    
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y tengo un ataque de  Punio Fuego ");    
    }

    @Override
    public void atacarLanzaLLamas() {
        System.out.println("Hola soy Charmander y tengo un ataque de  Lanza LLamas ");    
    }
}
