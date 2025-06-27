public class Cabinet {
    Docteur docteurs[];
    Patient patients[];
    Rendez_vous rendez_vouss[];



    public Docteur[] docteur_libres(){
        Docteur[] docteur_libres= new Docteur[10];
        int compteur=0;
        for (int i = 0; i < docteurs.length; i++) {
            boolean libre = true;
            for (int j = 0; j < rendez_vouss.length; j++) {
                if (rendez_vouss[j].docteur.equals(docteurs[i])) {
                    libre = false;
                    break;
                }
            }
            if (libre) {
                docteur_libres[compteur] = docteurs[i];
                compteur++;
            }
        }
        return docteur_libres;
    }

}
