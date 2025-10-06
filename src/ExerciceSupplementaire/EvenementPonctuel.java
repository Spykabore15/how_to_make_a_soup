package ExerciceSupplementaire;

public class EvenementPonctuel extends Evenement {
    private double hDebut;
    private double hFin;

    public EvenementPonctuel(String titre, String lieu, double hDebut, double hFin) {
        super(titre, lieu);
        this.hDebut = hDebut;
        this.hFin = hFin;
    }

    @Override
    public String toString() {
        return super.toString() + " (de " + hDebut + "h à " + hFin + "h)";
    }

}
