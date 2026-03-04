package moyen.transport;

public class Vehicule {
    String matricule;

    public Vehicule() { this.matricule = "no-mat"; }
    public Vehicule(int n) { this.matricule = "no-mat_"+n; }

    public void deplacer() {
        System.out.println("Je ne sais pas comment me se déplace");
    }

    public String toString(){
        return "Un Vehicule no-mat";
    }
}
