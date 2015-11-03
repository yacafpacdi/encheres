package requetes;

import entites.Vente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RequetesJPQL {
    
    public static void main(String[] args) {
        System.out.println("=================DEBUT=======================");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("encheresMySQLPU");
        EntityManager em = emf.createEntityManager();
        
        Outils<Vente> ov = new Outils<>();
        
        System.out.println("1) Afficher toutes ventes dans une catégorie.");
        String req = "";
        Query qr = em.createQuery(req);
        List<Vente> lv = qr.getResultList();
        ov.afficher(lv);
        System.out.println("2) Afficher une liste de produits d'une catégorie.");
        System.out.println("3) Afficher les catégories de vente d'un utilisateur.");
        System.out.println("4) Afficher les produits qui ont des enchères.");
        System.out.println("5) Afficher les produits qui ont été vendus.");
        System.out.println("6) Afficher les ventes d'une catégorie par un utilisateur.");
        
        
        System.out.println("=================FIN=======================");
    }  
    
    
}
