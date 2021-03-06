/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author moulaYounes
 */
@Entity
public class DevisDemmande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String commentaire;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDevisDemmande;
    private BigDecimal montantTotal;
    private BigDecimal tva;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "devisDemmande")
    private List<DevisDemmandeItem> devisDemmandeItems;
    @ManyToOne
    private Abonne abonne;
    @ManyToOne
    private Projet projet;
    @OneToOne
    private Demmande demande;
    @ManyToOne
    private Responsable responsable;
    

  
    public Responsable getResponsable() {
        if (responsable == null) {
            responsable = new Responsable();
        }
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public BigDecimal getTva() {
         if (tva == null) {
            tva = new BigDecimal(0);
        }
        return tva;
    }

    public void setTva(BigDecimal tva) {
        this.tva = tva;
    }

    public Demmande getDemande() {
        if (demande == null) {
            demande = new Demmande();
        }
        return demande;
    }

    public void setDemande(Demmande demande) {
        this.demande = demande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateDevisDemmande() {
        return dateDevisDemmande;
    }

    public void setDateDevisDemmande(Date dateDevisDemmande) {
        this.dateDevisDemmande = dateDevisDemmande;
    }

    public BigDecimal getMontantTotal() {
         if (montantTotal == null) {
            montantTotal = new BigDecimal(0);
        }
        return montantTotal;
    }

    public void setMontantTotal(BigDecimal montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Client getClient() {
        if (client == null) {
            client = new Client();
        }
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<DevisDemmandeItem> getDevisDemmandeItems() {
        if (devisDemmandeItems == null) {
            devisDemmandeItems = new ArrayList();
        }
        return devisDemmandeItems;
    }

    public void setDevisDemmandeItems(List<DevisDemmandeItem> devisDemmandeItems) {
        this.devisDemmandeItems = devisDemmandeItems;
    }

    public Abonne getAbonne() {
        if (abonne == null) {
            abonne = new Abonne();
        }
        return abonne;
    }

    public void setAbonne(Abonne abonne) {
        this.abonne = abonne;
    }

    public Projet getProjet() {
        if (projet == null) {
            projet = new Projet();
        }
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
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
        if (!(object instanceof DevisDemmande)) {
            return false;
        }
        DevisDemmande other = (DevisDemmande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Devis[ id=" + id + " ]";
    }

}
