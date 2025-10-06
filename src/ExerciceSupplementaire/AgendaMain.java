package ExerciceSupplementaire;

public class AgendaMain {
    public static void main(String[] args) {
        // Création d'une personne avec son agenda
        AgendaPersonne agendaPersonne = new AgendaPersonne();
        agendaPersonne.setNomPrenom("Jean Dupont");

        // Création d'événements
        EvenementPonctuel examenPOO = new EvenementPonctuel("Examen POO", "Salle A1", 8.5, 10.0);
        EvenementPonctuel rendezVous = new EvenementPonctuel("Rendez-vous médical", "Hôpital Central", 14.0, 15.5);
        EvenementRepetif coursPOO = new EvenementRepetif("Cours POO", "Amphi B2", 7, 14);

        System.out.println(coursPOO);
        // Enregistrement des événements dans l'agenda
        agendaPersonne.EnregistrerEvt(14, 6, examenPOO);
        agendaPersonne.EnregistrerEvt(20, 5, rendezVous);
        agendaPersonne.EnregistrerEvt(1, 10, coursPOO);

        // Affichage de l'agenda complet
        System.out.println("=== Agenda initial ===");
        agendaPersonne.Affich();

        // Suppression d'un événement
        agendaPersonne.AnnulerEvt(20, 5, "Rendez-vous médical");

        // Tentative d'ajout d'un événement avec un titre déjà existant (doit échouer)
        EvenementPonctuel examenPOODouble = new EvenementPonctuel("Examen POO", "Salle A2", 10.5, 12.0);
        agendaPersonne.EnregistrerEvt(14, 6, examenPOODouble);

        // Affichage après modifications
        System.out.println("\n=== Après suppression et tentative d'ajout en double ===");
        agendaPersonne.Affich();


        int indiceJour = agendaPersonne.RechercheJour(25, 12);
        System.out.println("\nRecherche du 25/12 : " + (indiceJour == -1 ? "Non trouvé" : "Trouvé"));

    }

}
