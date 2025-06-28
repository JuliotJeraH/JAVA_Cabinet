
public class Main {
    public static void main(String[] args){
        Docteur docteurs[]=new Docteur[6];
        Patient patients[]=new Patient[5];
        Rendez_vous rendez_vouss[]=new Rendez_vous[5];

// --------------------------------------- DATY ----------------------------------------------------
        Daty date1=new Daty();
        date1.annee=2025;
        date1.mois=6;
        date1.jour=22;
        date1.heure=14;
        date1.minute=00;

        Daty date2=new Daty();
        date2.annee=2025;
        date2.mois=6;
        date2.jour=23;
        date2.heure=14;
        date2.minute=00;

        Daty date3=new Daty();
        date3.annee=2025;
        date3.mois=6;
        date3.jour=24;
        date3.heure=14;
        date3.minute=00;

        Daty date4=new Daty();
        date4.annee=2025;
        date4.mois=6;
        date4.jour=25;
        date4.heure=14;
        date4.minute=00;

        Daty date5=new Daty();
        date5.annee=2025;
        date5.mois=6;
        date5.jour=26;
        date5.heure=14;
        date5.minute=00;

// ------------------------------------------------- DOCTEUR -------------------------------------------------------
        Docteur docteur1=new Docteur();
        docteur1.nom="Njaka";
        docteur1.prenom="Mahefa";

        Docteur docteur2=new Docteur();
        docteur2.nom="Randria";
        docteur2.prenom="Saropiaro";

        Docteur docteur3=new Docteur();
        docteur3.nom="Rasolo";
        docteur3.prenom="Tendry";

        Docteur docteur4=new Docteur();
        docteur4.nom="Andry";
        docteur4.prenom="Rakoto";

        Docteur docteur5=new Docteur();
        docteur5.nom="Njakatiana";
        docteur5.prenom="Edmond";

        Docteur docteur6=new Docteur();
        docteur6.nom="Solofo";
        docteur6.prenom="Niaina";

// ------------------------------------------------- PATIENT ---------------------------------------------------------------

        Patient patient1=new Patient();
        patient1.prenom="Rova";
        patient1.prenom="Emilie";

        Patient patient2=new Patient();
        patient2.prenom="Ravo";
        patient2.prenom="Nekena";

        Patient patient3=new Patient();
        patient3.prenom="Nantenaina";
        patient3.prenom="Diamondra";

        Patient patient4=new Patient();
        patient4.prenom="Valisoa";
        patient4.prenom="Nandrasana";

        Patient patient5=new Patient();
        patient5.prenom="Sarobidy";
        patient5.prenom="Rindrasoa";

// ---------------------------------------------- RENDEZ-VOUS ------------------------------------------------------
        Rendez_vous rendez_vous1=new Rendez_vous();
        rendez_vous1.date=date5;
        rendez_vous1.docteur=docteur1;
        rendez_vous1.patient=patient1;

        Rendez_vous rendez_vous2=new Rendez_vous();
        rendez_vous2.date=date4;
        rendez_vous2.docteur=docteur2;
        rendez_vous2.patient=patient2;

        Rendez_vous rendez_vous3=new Rendez_vous();
        rendez_vous3.date=date3;
        rendez_vous3.docteur=docteur3;
        rendez_vous3.patient=patient3;

        Rendez_vous rendez_vous4=new Rendez_vous();
        rendez_vous4.date=date2;
        rendez_vous4.docteur=docteur4;
        rendez_vous4.patient=patient4;

        Rendez_vous rendez_vous5=new Rendez_vous();
        rendez_vous5.date=date1;
        rendez_vous5.docteur=docteur5;
        rendez_vous5.patient=patient5;

        
// -------------------------------------------- TABLEAUX --------------------------------------------------------

        docteurs[0]=docteur1;
        docteurs[1]=docteur2;
        docteurs[2]=docteur3;
        docteurs[3]=docteur4;
        docteurs[4]=docteur5;
        docteurs[5]=docteur6;



        patients[0]=patient1;
        patients[1]=patient2;
        patients[2]=patient3;
        patients[3]=patient4;
        patients[4]=patient5;


        rendez_vouss[0]=rendez_vous1;
        rendez_vouss[1]=rendez_vous2;
        rendez_vouss[2]=rendez_vous3;
        rendez_vouss[3]=rendez_vous4;
        rendez_vouss[4]=rendez_vous5;


        Cabinet cabinet1= new Cabinet();
        cabinet1.docteurs=docteurs;
        cabinet1.patients=patients;
        cabinet1.rendez_vouss=rendez_vouss;




        //      --------------------------------   Affichages  ------------------------------------------------------
        Docteur[] docteur_libres = cabinet1.docteur_libres();
        System.out.println("Docteurs libres :\n");
        for (int i = 0; i < docteur_libres.length; i++) {
            if (docteur_libres[i] != null) {
                System.out.println("Docteur " + (i + 1) + ": " + docteur_libres[i].nom + " " + docteur_libres[i].prenom+"\n");
            }
        }


        Docteur[] docteur_nonlibres = cabinet1.docteur_nonlibres();
        System.out.println("Docteurs non libres :\n");
        for (int i = 0; i < docteur_nonlibres.length; i++) {
            if (docteur_nonlibres[i] != null) {
                System.out.println("Docteur " + (i + 1) + ": " + docteur_nonlibres[i].nom + " " + docteur_nonlibres[i].prenom);
            }
        }

    }
        
}
