package tp05.moyen.transport;

public class Moto extends Vehicule {
    static int generateurNumeroMoto;
    String numMoto;

    public Moto() {
        numMoto = "Moto-"+ ++generateurNumeroMoto;
    }

    public void deplacer() {
        System.out.println("La moto file vite entre les voitures");
    }

    public String toString(){
        return numMoto;
    }
}
