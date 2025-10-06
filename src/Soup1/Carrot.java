package Soup1;

public class Carrot {
    private double poids;
    private double longueur;

    public Carrot(double poids, double longueur){
        this.poids = poids;
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getPoids() {
        return poids;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    @Override
    public String toString(){
        return "Carotte: ["+poids+" kg - "+longueur+ " cm]";
    }
}
