package manip;
import java.util.ArrayList;
import moyen.transport.Vehicule;
import moyen.transport.Voiture;
import moyen.transport.Moto;

public class ListManip {
    static ArrayList<Voiture> voitureList1 = new ArrayList<>();
    static ArrayList<Voiture> voitureList2 = new ArrayList<>();
    static ArrayList<Integer> integerList = new ArrayList<>();
    static ArrayList<Vehicule> vehiculeList;  // reference only, list created later

    public static void manip1() { ... } // fill and print voitureList1, voitureList2, integerList
    public static void manip2() { ... } // fill vehiculeList with Vehicule, Moto, and Voiture
    public static void manip3() { ... } // print vehiculeList using index and size()
    public static void manip4() { ... } // TODO: print vehiculeList using foreach loop

    public static void main(String[] args) {
        manip1();
        manip2();
        manip3();
    }
}
