package ExerciceSupplementaire;

public class Evenement {
    protected String titre;
    protected String lieu;

    public Evenement(){};

    public Evenement(String titre, String lieu){
        this.titre = titre;
        this.lieu = lieu;
    }
    @Override
    public String toString(){
        return "("+titre+" -- "+lieu+")";
    }

}
