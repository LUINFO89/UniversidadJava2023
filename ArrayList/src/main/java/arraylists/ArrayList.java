
package arraylists;


import java.util.List;

public class ArrayList{
    public static void main(String[] args) {
        List<Persona> lista = new java.util.ArrayList<Persona>();
        lista.add(new Persona(1,"Luis",34));
        lista.add(new Persona(2,"Ana",34));
        lista.add(new Persona(3,"Victoria",2));
        lista.add(new Persona(4,"Yajaira",34));

        System.out.println("------------FOR-----------");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba" + lista.get(i).getNombre());
        }
        System.out.println("-------------FOR EACH------------");

        for (Persona perso:lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }
    }
}
