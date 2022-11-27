package classes.vaisseaux;
import classes.Camps;
import classes.Planete;

public class Chasseur extends baseVaisseau {

    public Chasseur() {
    }

    public Chasseur(Camps camp) {
        baseVaisseau(2,1,10,camp);
    }

    
}
