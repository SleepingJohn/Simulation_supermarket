public class WaitingLineStrat {

    /**
     *Ein Supermarkt hat n Kassen.
     * Zu Beginn wird eine Kasse geöffnet und dann nach folgender Strategie
     * vorgegangen: jedes Mal wenn w Kunden bei einer Kasse warten,
     * wird eine neue Kasse eröffnet (solange möglich).
     * Eine Kasse wird geschlossen, wenn m Minuten kein Kunde
     * bedient wird (mindestens eine Kasse muss jedoch offen bleiben).

     * Ziel der Simulation: wie sieht eine möglichst "optimale" Wahl der Parameter w und m aus,
     * sodass die Kunden nicht zu lange warten müssen, aber auch die Kosten für besetzte Kassen nicht zu hoch werden.
      */
    /*
    int n;      //Anzahl der Kassen
    int w;      //Max Anzahl an Kunden die bei einer Kassa warten bis eine neue geöffnet wird.
    double m;   //Anzahl Minuten, wo kein Kunde bedient wurde
    double k;   //Kosten pro Kassa pro Minute
    int t;      //Simulationszeit in min */
public double strat(int n, int w, double m, double k, int t) {
    int countperCustomer=2; //Es dauert 2min einen Kunden zu bedienen
    int counter=0;
    for(int i =0; i<t; i++){//iterates one min
        // if()

        if(counter==countperCustomer){
            w--;


        }
        counter++;

    }

}

}

