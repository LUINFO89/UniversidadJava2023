package claabstractas;

public class Circulo extends Figura{

    private double radio;

    protected Circulo(){

    };
    protected Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calculaArea() {

        double pi = 3.14;

        double resultado = pi * radio * radio ;

        return resultado;
    }
}
