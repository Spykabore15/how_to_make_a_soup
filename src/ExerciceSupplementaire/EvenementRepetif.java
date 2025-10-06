package ExerciceSupplementaire;

public class EvenementRepetif extends Evenement{
    private int nbJours;
    private int periodicite;

    public EvenementRepetif(String titre, String lieu, int nbJours, int periodicite) {
        super(titre, lieu);
        this.nbJours = nbJours;
        this.periodicite = periodicite;
    }

    @Override
    public String toString() {
        return super.toString() + " (Nombre de JOURS : " + nbJours + "\t Périodicité : " + periodicite + ")";
    }
}
