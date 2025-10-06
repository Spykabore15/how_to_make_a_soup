package ExerciceSupplementaire;

public class AgendaPersonne {
    private String nomPrenom;
    private AgendaJournee[] agendaAnnee;
    private final static int taille = 100;
    private int index;

    AgendaPersonne(){
        agendaAnnee = new AgendaJournee[taille];
    }
    public int RechercheJour(int jour, int mois){
        for(int i =0; i<index;i++){
            if(this.agendaAnnee[i].jour == jour && this.agendaAnnee[i].mois == mois)
                return i;
        }
        return -1;
    }


    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public void EnregistrerEvt(int jour, int mois, Evenement e){
        if(e==null)
            return;
        for(int i =0; i<index;i++){
            if(this.agendaAnnee[i].jour == jour && this.agendaAnnee[i].mois == mois) {
                this.agendaAnnee[i].AjouterEvt(e);
                return;
            }
        }
        this.agendaAnnee[index] = new AgendaJournee(jour, mois);
        this.agendaAnnee[index++].AjouterEvt(e);
    }

    public void AnnulerEvt(int jour, int mois, String titre){
        for(int i = 0; i<index;i++){
            if(this.agendaAnnee[i].mois == mois && this.agendaAnnee[i].jour == jour){
                int key = this.agendaAnnee[i].RechercherEvt(titre);
                if(key != -1) {
                    this.agendaAnnee[i].SupprimerEvt(key);
                    return;
                }

            }
        }
    }

    public void Affich(){
        System.out.println("AGENDA ANNUEL de "+nomPrenom+"\n");
        for(int i = 0;i<index;i++){
            agendaAnnee[i].Affich();
        }
    }

}


