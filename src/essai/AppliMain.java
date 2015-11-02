package essai;

import entites.Categorie;
import entites.Enchere;
import entites.Produit;
import entites.Utilisateur;
import entites.Vente;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppliMain {

    public static void main(String[] args) {
        System.out.println("==========DEBUT============");

        //EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("encheresPU");
        EntityManager em = emf.createEntityManager();

        //Jeu de tests
        Enchere e01 = new Enchere(100f);
        Enchere e02 = new Enchere(200f);
        Enchere e03 = new Enchere(300f);

        Utilisateur u01 = new Utilisateur("UN", "un", "un@gmail.com", "passeUN");
        Utilisateur u02 = new Utilisateur("DEUX", "deux", "deux@gmail.com", "passeDEUX");
        Utilisateur u03 = new Utilisateur("TROIS", "trois", "trois@gmail.com", "passeTROIS");

        Date d01 = new GregorianCalendar(1981, 01, 01).getTime();
        Vente v01 = new Vente(1f, 10f, d01, 10, "terminé");
        Date d02 = new GregorianCalendar(1982, 02, 02).getTime();
        Vente v02 = new Vente(2f, 20f, d02, 20, "en cours");
        Date d03 = new GregorianCalendar(1983, 03, 03).getTime();
        Vente v03 = new Vente(3f, 30f, d03, 30, "prochainement");
        
        Produit p01 = new Produit("P01", "super", "parfait");
        Produit p02 = new Produit("P02", "hyper", "plus que parfait");
        Produit p03 = new Produit("P03", "méga", "subjonctif");
        
        Categorie c01 = new Categorie("C01");
        Categorie c02 = new Categorie("C02");
        Categorie c03 = new Categorie("C03");
        
        
        //Associations
        
        
        //Gestion des entités
        em.persist(e01);
        em.persist(e02);
        em.persist(e03);

        em.persist(u01);
        em.persist(u02);
        em.persist(u03);
        
        em.persist(v01);
        em.persist(v02);
        em.persist(v03);
        
        em.persist(p01);
        em.persist(p02);
        em.persist(p03);
        
        em.persist(c01);
        em.persist(c02);
        em.persist(c03);

        EntityTransaction et = em.getTransaction();
        et.begin();
        et.commit();

        em.close();
        emf.close();
        System.out.println("==========FIN============");

    }

}
