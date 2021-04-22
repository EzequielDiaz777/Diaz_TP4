package Diaz_TP4;

public class TestHerencia {

    public static void main(String[] args) {
        Position ubicacion = new Position(100,200);
        Guerrero thor = new Guerrero("Thor", ubicacion, true);
        for (int i = 0; i < 3; i++) {
            System.out.println("Estoy girando.");
            thor.girar();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("He avanzado un paso.");
            thor.avanzar();
        }
        for (int i = 0; i < 8; i++) {
            thor.disparar();
        }
    }
}

/*
Ejercicio 1:
1) Relación de composición.
2) Relación de herencia.
3) Relación de dependencia.

Ejercicio 2:
1) Cual es el estado de energía al inicializar la ejecución y cual después de ejecutarse el
ítem d.?
    Al instanciar la clase el estado de energia es de 100 y al finalizar es de 20.
2) Cual es la nueva posición del Guerrero al finalizar la ejecución?
    X = 50 Y = 200
3) Hacer el Diagrama de Clases en UML de este proyecto.
*/