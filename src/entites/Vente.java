package entites;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Vente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Float montantInitial;
    private Float montantReserve;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    private Integer duree;
    private String etat;
    
    
    
    //associations

    public Vente() {
    }

    public Vente(Float montantInitial, Float montantReserve, Date dateDebut, Integer duree, String etat) {
        this.montantInitial = montantInitial;
        this.montantReserve = montantReserve;
        this.dateDebut = dateDebut;
        this.duree = duree;
        this.etat = etat;
    }
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vente)) {
            return false;
        }
        Vente other = (Vente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Vente[ id=" + id + " ]";
    }

    public Float getMontantInitial() {
        return montantInitial;
    }

    public void setMontantInitial(Float montantInitial) {
        this.montantInitial = montantInitial;
    }

    public Float getMontantReserve() {
        return montantReserve;
    }

    public void setMontantReserve(Float montantReserve) {
        this.montantReserve = montantReserve;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
}
