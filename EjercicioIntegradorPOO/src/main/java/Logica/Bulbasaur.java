package Logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }
    
    

    @Override
    protected void atacarplacaje() {
        System.out.println("Hola soy Bulbasaur y tengo un ataque de placaje ");    
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y tengo un ataque de araniazo ");    
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola soy Bulbasaur y tengo un ataque de Mordizco ");    
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y tengo un ataque de Drenaje ");    
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y tengo un ataque de Paralizar ");    
    }
    
    
}
