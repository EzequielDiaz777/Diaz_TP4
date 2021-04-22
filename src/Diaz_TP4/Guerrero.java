package Diaz_TP4;

public class Guerrero extends Personaje {
    private boolean caballo;

    public Guerrero(String nick, Position ubicacion, boolean caballo) {
        super(nick, ubicacion);
        this.caballo = caballo;
    }
    
    @Override
    public void avanzar(){
        if(caballo){
            switch(getOrientacion()){
            case 'N':
                getUbicacion().setY(getUbicacion().getY()-10);
            case 'E':
                getUbicacion().setX(getUbicacion().getX()+10);
            case 'S':
                getUbicacion().setY(getUbicacion().getY()+10);
            case 'O':
                getUbicacion().setX(getUbicacion().getX()-10);
            }
        } else {
            super.avanzar();
        }
    }
    
    @Override
    public void disparar(){
        if(getEnergia() >9){
            System.out.println("Disparas una flecha.");
            setEnergia(getEnergia() - 10);
        } else {
            System.out.println("No tienes más energia para disparar flechas.");
        }
        if(getEnergia() < 30){
            caballo = false;
        }
    }

    public boolean getCaballo() {
        return caballo;
    }

    public void setCaballo(boolean caballo) {
        this.caballo = caballo;
    }
}