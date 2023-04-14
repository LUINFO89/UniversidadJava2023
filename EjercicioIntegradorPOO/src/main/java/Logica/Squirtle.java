package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
    

    @Override
    protected void atacarplacaje() {
        System.out.println("Hola soy Squirtle y tengo un ataque de placaje ");    
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y tengo un ataque de araniazo ");    
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola soy Squirtle y tengo un ataque de Mordizco ");    
    }

    @Override
    public void atacarHidrobomba() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atcarBurbuja() {
        System.out.println("Hola soy Squirtle y tengo un ataque de Burbujas ");    
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y tengo un ataque de Pistola de Agua ");    
    }
}
