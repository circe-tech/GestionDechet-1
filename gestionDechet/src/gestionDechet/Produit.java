package gestionDechet
import java.util.*;

public class Produit {

    private String idProduits;
    private String nom;
    private float prix;
    
    public Produit(String idProduits, String nom, float prix) {
        this.idProduits=idProduits;
        this.nom=nom;
        this.prix=prix;
    }

    
    public string getIdProduits() {
        return idProduits;
    }
    public void setIdProduits(String idProduits) {
        this.idProduits=idProduits;
    }

    public string getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom=nom;
    }

    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix=prix;
    }

    

}
