
package com.sabre.services.res.or.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceLevel" type="{http://services.sabre.com/res/or/v1_0}ServiceLevelType" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://services.sabre.com/res/or/v1_0}EquipmentType" minOccurs="0"/>
 *         &lt;element name="MeetAndGreetInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumBaggage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaximumPassengers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "serviceLevel",
    "equipment",
    "meetAndGreetInd",
    "maximumBaggage",
    "maximumPassengers"
})
public class ServiceType {

    @XmlElement(name = "ServiceLevel")
    protected ServiceLevelType serviceLevel;
    @XmlElement(name = "Equipment")
    protected EquipmentType equipment;
    @XmlElement(name = "MeetAndGreetInd")
    protected Boolean meetAndGreetInd;
    @XmlElement(name = "MaximumBaggage")
    protected Integer maximumBaggage;
    @XmlElement(name = "MaximumPassengers")
    protected Integer maximumPassengers;

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevelType }
     *     
     */
    public ServiceLevelType getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevelType }
     *     
     */
    public void setServiceLevel(ServiceLevelType value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentType }
     *     
     */
    public EquipmentType getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentType }
     *     
     */
    public void setEquipment(EquipmentType value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the meetAndGreetInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetAndGreetInd() {
        return meetAndGreetInd;
    }

    /**
     * Sets the value of the meetAndGreetInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetAndGreetInd(Boolean value) {
        this.meetAndGreetInd = value;
    }

    /**
     * Gets the value of the maximumBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumBaggage() {
        return maximumBaggage;
    }

    /**
     * Sets the value of the maximumBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumBaggage(Integer value) {
        this.maximumBaggage = value;
    }

    /**
     * Gets the value of the maximumPassengers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumPassengers() {
        return maximumPassengers;
    }

    /**
     * Sets the value of the maximumPassengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumPassengers(Integer value) {
        this.maximumPassengers = value;
    }

}
