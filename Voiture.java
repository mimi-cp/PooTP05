package tp05.moyen.transport;

public class Voiture extends Vehicule {
    private static int generateurDeNumeroDeVoiture;
    private int numero;
    public String couleur = "blanc";

    public Voiture() { numero = ++Voiture.generateurDeNumeroDeVoiture; }
    public Voiture(String matricule) { this(); this.matricule = matricule; }
    public Voiture(String matricule, String couleur) { this(); this.matricule = matricule; this.couleur = couleur; }

    public void demarrer() { ... }
    public void deplacer() { ... }
    public void klaxonner() { ... }
    public String toString() { return "Voiture:Num:"+ this.numero+ " Mat: "+this.matricule; }
  }
