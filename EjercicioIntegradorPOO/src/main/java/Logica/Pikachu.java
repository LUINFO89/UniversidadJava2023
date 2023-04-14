package Logica;

public class Pikachu extends Pokemon implements IElectro{

    public Pikachu() {
    }
    
    

    @Override
    protected void atacarplacaje() {
        System.out.println("Hola soy Pikachu y tengo un ataque de placaje ");    
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y tengo un ataque de araniazo ");    
    }

    @Override
    protected void atacarMordizco() {
        System.out.println("Hola soy Pikachu y tengo un ataque de mordizco ");    
    }

    @Override
    public void atacarImpacttrueno() {
        System.out.println("Hola soy Pikachu y tengo un ataque de Impact Trueno ");    
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Picacku y tengo un ataque de Punio Trueno ");    
    }
}
