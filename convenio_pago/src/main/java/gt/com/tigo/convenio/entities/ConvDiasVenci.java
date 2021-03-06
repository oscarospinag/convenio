/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.tigo.convenio.entities;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@Entity
@Table(name = "CONV_DIAS_VENCI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConvDiasVenci.findAll", query = "SELECT c FROM ConvDiasVenci c")
    , @NamedQuery(name = "ConvDiasVenci.findById", query = "SELECT c FROM ConvDiasVenci c WHERE c.id = :id")
    , @NamedQuery(name = "ConvDiasVenci.findByDescripcion", query = "SELECT c FROM ConvDiasVenci c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "ConvDiasVenci.findByValor", query = "SELECT c FROM ConvDiasVenci c WHERE c.valor = :valor")})
public class ConvDiasVenci implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name = "SEQ_ID_GENERATOR",sequenceName = "CONV_SEQ_DIAS_VENCI", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_GENERATOR")
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "VALOR")
    private Short valor;

    public ConvDiasVenci() {
    }

    public ConvDiasVenci(Long id) {
        this.id = id;
    }

    public ConvDiasVenci(Long id, String descripcion, Short valor) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Short getValor() {
        return valor;
    }

    public void setValor(Short valor) {
        this.valor = valor;
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
        if (!(object instanceof ConvDiasVenci)) {
            return false;
        }
        ConvDiasVenci other = (ConvDiasVenci) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.com.tigo.convenio.model.entities.ConvDiasVenci[ id=" + id + " ]";
    }
    
}
