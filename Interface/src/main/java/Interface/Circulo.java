package Interface;

public class Circulo implements Figura, Rotable, Dibujable{

    private double radio;

    protected Circulo(){

    };

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea() {

        double pi = 3.14;

        double resultado = pi * radio * radio ;

        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola Vengo de una interface y puedo ser dibujado");
    }

    @Override
    public void rotar() {
        System.out.println("Hola vengo de una interface y puedo Rotar");
    }
}
