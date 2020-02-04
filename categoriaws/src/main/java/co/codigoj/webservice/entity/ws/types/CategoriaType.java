
package co.codigoj.webservice.entity.ws.types;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CategoriaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CategoriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoriaType", propOrder = {
    "id",
    "descripcion"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
public class CategoriaType {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    protected int id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    protected String descripcion;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
