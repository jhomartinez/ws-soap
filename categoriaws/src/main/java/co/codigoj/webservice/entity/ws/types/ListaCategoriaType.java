
package co.codigoj.webservice.entity.ws.types;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListaCategoriaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaCategoriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="categoria" type="{http://webservice.codigoj.co/entity/ws/types}CategoriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaCategoriaType", propOrder = {
    "categoria"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
public class ListaCategoriaType {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    protected List<CategoriaType> categoria;

    /**
     * Gets the value of the categoria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoriaType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-01T01:11:46-05:00", comments = "JAXB RI v2.2.11")
    public List<CategoriaType> getCategoria() {
        if (categoria == null) {
            categoria = new ArrayList<CategoriaType>();
        }
        return this.categoria;
    }

}
