package classes.vaisseaux;
import classes.Camps;
import classes.Planete;

public class BaseVaisseau {

    private int PV;
    private int degats;
    private int tempsGeneration;
    private Camps camp;


    public BaseVaisseau() {
    }

    public BaseVaisseau(int PC, int degats, int tempsGeneration, Camps camp) {
        this.PV = PC;
        this.degats = degats;
        this.tempsGeneration = tempsGeneration;
        this.camp = camp;
    }

    public void pertePV(int degatsPris){
        this.setPV(this.getPV()-degatsPris);
    }

    public void attackVaisseau(baseVaisseau ennemi){
        ennemi.pertePV(this.getDegats());
        if(ennemi.getPV()<=0){
            ennemi = null;
        }
    }

    public void attackPlanete(Planete planete){
        planete.pertePV(this.getDegats())
        if(planete.getPV()<=0){
            if(planete.getCamp().getNom()!="Neutre"){
                plante.setCamp(Neutre);
            }
            else{
                planete.setCamp(this.getCamp());
            }
        }
    }


    public int getPV() {
        return this.PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getDegats() {
        return this.degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

    public int getTempsGeneration() {
        return this.tempsGeneration;
    }

    public void setTempsGeneration(int tempsGeneration) {
        this.tempsGeneration = tempsGeneration;
    }

    public Camps getCamp() {
        return this.camp;
    }

    public void setCamp(Camps camp) {
        this.camp = camp;
    }
    

    
    
}
