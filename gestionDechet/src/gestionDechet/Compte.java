package gestionDechet;
import java.util.*;


public class Compte {

    private String idCompte;
    private String email;
    private String mdpCompte;
    private int pointsFidelite;
    
    
    public Compte(String idCompte, String email, String mdpCompte, int pointsFidelite) {
        this.idCompte=idCompte;
        this.email=email;
        this.mdpCompte=mdpCompte;
        this.pointsFidelite=pointsFidelite;
    }

    public String getIdCompte(){
        return idCompte;
    }
    public void setIdCompte(String idCompte) {
        this.idCompte=idCompte ;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email=email ;
    }

    public String getMdpCompte(){
        return mdpCompte;
    }
    public void setMdpCompte(String mdpCompte) {
        this.mdpCompte=mdpCompte ;
    }

    public String getPointsFidelite(){
        return pointsFidelite;
    }
    public void setPointsFidelite(String pointsFidelite) {
        this.pointsFidelite=pointsFidelite ;
    }

    
    public boolean seConnecter(String email, String mdp) {
        return this.email.equals(email) && this.mdpCompte.equals(mdp)  ;
    }

   
    public List<Depot> consulterHistoriqueDepots(CentreDeTrie centre) {
        return centre.getStatistique().getHistoriqueDepots();
    }

    
    public int consulterPoints() {
        return pointsFidelite;
    }

   
    public boolean echangerPoints(bonReduction bon) {
        if (bon.verifierreduction(pointsFielite) {
            pointsFidelite-=bon.getPointsNecessaires;
            return true; }
        return false;
    }

    
    public boolean deposerDechets(Poubelle poubelle, TypeDechet typeDechet, float quantite) {
        if (!poubelle.verificationConformiteDechet(typeDechet) {
           return false;  }
        if (poubelle.estPleine()) {
            poubelle.envoyerNotification(); }
        Depot depot= new Depot(typeDechet, quantite, new date(), pointsGagnes);
        depot.enregistrerDepot;
        historiqueDepots.add(depot);
        pointsFidelite+=pointsGagnes;
        poubelle.calculerQuantiteDechets(typeDechet);

        return true;
    }

}
