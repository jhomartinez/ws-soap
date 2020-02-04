
package co.codigoj.webservice.entity.ws.types;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaCategorias" type="{http://webservice.codigoj.co/entity/ws/types}ListaCategoriaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listaCategorias"
})
@XmlRootElement(name = "buscarResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
public class BuscarResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    protected ListaCategoriaType listaCategorias;

    /**
     * Obtiene el valor de la propiedad listaCategorias.
     * 
     * @return
     *     possible object is
     *     {@link ListaCategoriaType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    public ListaCategoriaType getListaCategorias() {
        return listaCategorias;
    }

    /**
     * Define el valor de la propiedad listaCategorias.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaCategoriaType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    public void setListaCategorias(ListaCategoriaType value) {
        this.listaCategorias = value;
    }

}
