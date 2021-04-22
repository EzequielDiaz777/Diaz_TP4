package Diaz_TP4;

public class Personaje {

    private Position ubicacion;
    private String nick;
    private int vidas = 3;
    private int energia = 100;
    private char orientacion = 'N';

    Personaje(String nick, Position ubicacion) {
        this.nick = nick;
        this.ubicacion = ubicacion;
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public int getVidas() {
        return vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }

    public void disparar() {
        if (energia > 9) {
            System.out.println("Disparas una flecha.");
            energia -= 10;
        } else {
            System.out.println("No tienes más energia para disparar flechas.");
        }
    }

    public String posicionActual() {
        return ubicacion.posicionActual();
    }

    public void girar() {
        switch (orientacion) {
            case 'N':
                orientacion = 'E';
                break;
            case 'E':
                orientacion = 'S';
                break;
            case 'S':
                orientacion = 'O';
                break;
            case 'O':
                orientacion = 'N';
                break;
        }
    }

    public void avanzar() {
        switch (orientacion) {
            case 'N':
                ubicacion.setY(ubicacion.getY() - 1);
                break;
            case 'E':
                ubicacion.setX(ubicacion.getX() + 1);
                break;
            case 'S':
                ubicacion.setX(ubicacion.getY() + 1);
                break;
            case 'O':
                ubicacion.setX(ubicacion.getX() - 1);
                break;
        }
    }
}