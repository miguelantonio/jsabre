
package org.ebxml.namespaces.messageheader;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageStatus.type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageStatus.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="UnAuthorized"/>
 *     &lt;enumeration value="NotRecognized"/>
 *     &lt;enumeration value="Received"/>
 *     &lt;enumeration value="Processed"/>
 *     &lt;enumeration value="Forwarded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messageStatus.type")
@XmlEnum
public enum MessageStatusType {

    @XmlEnumValue("UnAuthorized")
    UN_AUTHORIZED("UnAuthorized"),
    @XmlEnumValue("NotRecognized")
    NOT_RECOGNIZED("NotRecognized"),
    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Forwarded")
    FORWARDED("Forwarded");
    private final String value;

    MessageStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageStatusType fromValue(String v) {
        for (MessageStatusType c: MessageStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
