
package com.sabre.services.res.or.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateProvince" type="{http://services.sabre.com/res/or/v1_0}CodeDescriptionType" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://services.sabre.com/res/or/v1_0}CodeDescriptionType" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "locationType",
    "addressLine",
    "cityCode",
    "cityName",
    "stateProvince",
    "postCode",
    "country",
    "latitude",
    "longitude",
    "altitude"
})
public class AddressType {

    @XmlElement(name = "LocationType")
    protected String locationType;
    @XmlElement(name = "AddressLine")
    protected List<String> addressLine;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "StateProvince")
    protected CodeDescriptionType stateProvince;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "Country")
    protected CodeDescriptionType country;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "Altitude")
    protected String altitude;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<String>();
        }
        return this.addressLine;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the stateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setStateProvince(CodeDescriptionType value) {
        this.stateProvince = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setCountry(CodeDescriptionType value) {
        this.country = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitude(String value) {
        this.altitude = value;
    }

}
