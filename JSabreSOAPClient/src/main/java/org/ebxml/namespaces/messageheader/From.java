
package org.ebxml.namespaces.messageheader;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}PartyId" maxOccurs="unbounded"/>
 *         &lt;element name="Role" type="{http://www.ebxml.org/namespaces/messageHeader}non-empty-string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partyId",
    "role"
})
@XmlRootElement(name = "From")
public class From {

    @XmlElement(name = "PartyId", required = true)
    protected List<PartyId> partyId;
    @XmlElement(name = "Role")
    protected String role;

    /**
     * Gets the value of the partyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyId }
     * 
     * 
     */
    public List<PartyId> getPartyId() {
        if (partyId == null) {
            partyId = new ArrayList<PartyId>();
        }
        return this.partyId;
    }
    
    public void setPartyId(List<PartyId> partyId) {
        this.partyId = partyId;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

}
