package Menu;

public class PrimiPiatti extends Portata {

    private boolean glutenFree;

    public PrimiPiatti(String type, String name, Integer price, boolean glutenFree, TipoEnum tipoPortata) {
        super(type, name, price, tipoPortata);
        this.glutenFree = glutenFree;
    }

    /*public boolean isGlutenFree() {
        if (glutenFree) {
            return true;
        } else {
            return false;
        }
    }*/

    @Override
    public void printPortataDetail() {
        if (glutenFree) {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + "Senza Glutine" + " - Tipo portata: " + getTipoPortata());
        } else {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + "Con Glutine" + " - Tipo portata: " + getTipoPortata());
        }
    }
}


