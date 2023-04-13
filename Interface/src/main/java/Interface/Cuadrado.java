package Interface;

public class Cuadrado implements Figura , Dibujable{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        double resultado = lado * lado ;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola vengo de una Interface y puedo ser dibiujado");
    }
}

