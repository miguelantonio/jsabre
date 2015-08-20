
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Record for all systems (consumer, proxies and gateways, providers) to use to trace the message. 
 * 			The value is the common system name. 
 * 			
 * 
 * <p>Java class for TraceRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TraceRecord">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.sabre.com/STL_Header/v120>Identifier">
 *       &lt;attribute name="key" type="{http://services.sabre.com/STL_Header/v120}Text.Long" />
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="appInstance" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *       &lt;attribute name="cluster" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *       &lt;attribute name="host" type="{http://services.sabre.com/STL_Header/v120}Identifier" />
 *       &lt;attribute name="targetURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="role" type="{http://services.sabre.com/STL_Header/v120}TraceRole" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraceRecord", propOrder = {
    "value"
})
public class TraceRecord {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "start", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlAttribute(name = "end")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlAttribute(name = "appInstance")
    protected String appInstance;
    @XmlAttribute(name = "cluster")
    protected String cluster;
    @XmlAttribute(name = "host")
    protected String host;
    @XmlAttribute(name = "targetURI")
    @XmlSchemaType(name = "anyURI")
    protected String targetURI;
    @XmlAttribute(name = "role")
    protected TraceRole role;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the appInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInstance() {
        return appInstance;
    }

    /**
     * Sets the value of the appInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInstance(String value) {
        this.appInstance = value;
    }

    /**
     * Gets the value of the cluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * Sets the value of the cluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCluster(String value) {
        this.cluster = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the targetURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetURI() {
        return targetURI;
    }

    /**
     * Sets the value of the targetURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetURI(String value) {
        this.targetURI = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link TraceRole }
     *     
     */
    public TraceRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceRole }
     *     
     */
    public void setRole(TraceRole value) {
        this.role = value;
    }

}
