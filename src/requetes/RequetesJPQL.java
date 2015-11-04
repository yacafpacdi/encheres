package requetes;

import entites.Produit;
import entites.Vente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RequetesJPQL {
    
    public static void main(String[] args) {
        System.out.println("=================DEBUT=======================");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("encheresPU");
        EntityManager em = emf.createEntityManager();
        
        Outils<Vente> ov = new Outils<>();
        Outils<Produit> op = new Outils<>();
        
        Long id=3L;
        System.out.println("1) Afficher toutes ventes dans la catégorie: "+id);
        String req = "select p.ventes from Produit p where p.categorie.id=:idParam";
        Query qr = em.createQuery(req);
        qr.setParameter("idParam", id);
        List<Vente> lv = qr.getResultList();
        ov.afficher(lv);
        System.out.println("2) Afficher tous les produits dans la catégorie: "+id);
        req = "select c.produits from Categorie c where c.id=:idParam"; 
//      req = "select p from Produit p where p.categorie.id=:idParam";
        qr=em.createQuery(req);
        qr.setParameter("idParam", id);
        List<Produit> lp = qr.getResultList();
        op.afficher(lp);                
        System.out.println("3) Afficher les catégories de vente de l'utilisateur: "+id);
        req ="select distinct p.categorie from Produit p " ;
        
//        System.out.println("4) Afficher les produits qui ont des enchères.");
//        System.out.println("5) Afficher les produits qui ont été vendus.");
//        System.out.println("6) Afficher les ventes d'une catégorie par un utilisateur.");
        
        
        System.out.println("=================FIN=======================");
    }  
    
    
}
