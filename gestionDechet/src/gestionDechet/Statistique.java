package gestionDechet;
import java.util.*;


public class Statistique {

    private List<Depot> historiqueDepots;
    
    public Statistique() {
        this.historiqueDepots= new ArrayList<>();
    }

    
    public List<Depot> getHistoriqueDepots() {
        return historiqueDepots ;
    }

    public void setHistoriqueDepots(List<Depot> historiqueDepots) {
        this.historiqueDepots=historiqueDepots;
    }

   public void sauvergarderDepot(Depot depot) {
    historiqueDepots.add(depot);
   }

    public float calculerTotalDechets() {
        float total=0;
        for (Depot depot: historiqueDepot) {
            total+=depot.getQuantite() ; }
        return total;
    }

    
    public float productionMoyenne() {
        if (historiqueDepots.isEmpty()) {
            return 0 ; }
        
        return calculerTotalDechets/historiqueDepots.size();
    }

}
