package classes;

public class Camps {
    private String nom;
    private int puissance;
    private int nbPlanetes;
    private int nbVaisseaux;
    private String couleur;

    public Camps() {
    }

    public Camps(String nom, int puissance, int nbPlanetes, int nbVaisseaux, String couleur) {
        this.nom = nom;
        this.puissance = puissance;
        this.nbPlanetes = nbPlanetes;
        this.nbVaisseaux = nbVaisseaux;
        this.couleur = couleur;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getNbPlanetes() {
        return this.nbPlanetes;
    }

    public void setNbPlanetes(int nbPlanetes) {
        this.nbPlanetes = nbPlanetes;
    }

    public int getNbVaisseaux() {
        return this.nbVaisseaux;
    }

    public void setNbVaisseaux(int nbVaisseaux) {
        this.nbVaisseaux = nbVaisseaux;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }



    
}
