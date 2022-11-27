package classes;

public class Planete {
    private int PV;
    private int niveau;
    private camps camp;

    public Planete(int PV, int niveau, camps camp) {
        this.PV = PV;
        this.niveau = niveau;
        this.camp = camp;
    }

    public Planete() {
    }


    public int getPV() {
        return this.PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public camps getCamp() {
        return this.camp;
    }

    public void setCamp(camps camp) {
        this.camp = camp;
    }
    


}
