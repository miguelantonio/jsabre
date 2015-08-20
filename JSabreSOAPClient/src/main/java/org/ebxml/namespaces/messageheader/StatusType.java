
package org.ebxml.namespaces.messageheader;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status.type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="status.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Reset"/>
 *     &lt;enumeration value="Continue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "status.type")
@XmlEnum
public enum StatusType {

    @XmlEnumValue("Reset")
    RESET("Reset"),
    @XmlEnumValue("Continue")
    CONTINUE("Continue");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
