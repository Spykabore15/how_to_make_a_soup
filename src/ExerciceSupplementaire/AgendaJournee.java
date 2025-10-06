package ExerciceSupplementaire;

import java.util.Objects;

public class AgendaJournee {
    protected int jour;
    protected int mois;
    protected Evenement[] lesEvtsDuJour;
    private static final int taille = 10;
    private int index;

    public AgendaJournee(int jour, int mois){
        this.jour = jour;
        this.mois = mois;
        this.lesEvtsDuJour = new Evenement[taille];
    }

    public AgendaJournee(){
        this.lesEvtsDuJour = new Evenement[taille];
    }

    public int RechercherEvt(String titre){
        for(int i=0;i<index;i++){
            if(Objects.equals(lesEvtsDuJour[i].titre, titre))
                return i;
        }
        return -1;
    }

    public void AjouterEvt(Evenement e){
        if(e==null){
            System.out.println("Assurez-vous de créer l'évènement avant de l'ajouter");
            return;
        }
        if(index >=taille){
            System.out.println("L'agenda est complet");
            return;
        }
        if (RechercherEvt(e.titre) != -1) {
            System.out.println("L'évènement est déjà planifié");
            return;
        }
        lesEvtsDuJour[index++] = e;

    }

    public void SupprimerEvt(int indice){
        if(indice >=taille){
            System.out.println("Indice invalide");
            return;
        }
        if(lesEvtsDuJour[indice] == null)
            return;

        for(int i = indice;i<index;i++){
            lesEvtsDuJour[i] = lesEvtsDuJour[i+1];
        }
        index--;
    }

    public void Affich(){
        System.out.println("{\nJour : "+jour+"\nMois : "+mois+"\nEvenements : [");
        for(int i = 0; i<index;i++){
            System.out.println(lesEvtsDuJour[i]+"\n");
        }
        System.out.println("]\n }");
    }

}
