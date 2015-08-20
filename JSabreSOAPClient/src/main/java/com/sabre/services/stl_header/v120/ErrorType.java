
package com.sabre.services.stl_header.v120;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Transport"/>
 *     &lt;enumeration value="Validation"/>
 *     &lt;enumeration value="Application"/>
 *     &lt;enumeration value="BusinessLogic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorType")
@XmlEnum
public enum ErrorType {


    /**
     * 
     * 						Transport errors occur when the infrastructure systems are unable to deliver the request message
     * 						to the service provider or the service response is not delivered within the allotted time frame.
     * 						These errors are always detected by the transport infrastructure systems. The detecting system
     * 						should indicate the need for compensation in Severity and Status values. These errors may be
     * 						transient and consumers may choose to retry their request.
     * 					
     * 
     */
    @XmlEnumValue("Transport")
    TRANSPORT("Transport"),

    /**
     * 
     * 						Validation errors occur when the message is determined to not conform to the interface
     * 						specifications. For example, it is an validation error when the request violates security
     * 						requirements or the message is not schema valid according to the service interface schema. These
     * 						errors may be detected by either the transport or application systems. Applications must not
     * 						make changes that will require compensation when validation errors are detected. These errors
     * 						are caused by the structure or content of the request and consumers should not attempt to retry
     * 						their unmodified request.
     * 					
     * 
     */
    @XmlEnumValue("Validation")
    VALIDATION("Validation"),

    /**
     * 
     * 						Application errors occur when a valid message is delivered to the service provider yet the
     * 						request cannot be completely processed. This can occur when the provider has technical issues
     * 						such as internal exceptions, database locks, or connectivity failure to a system it is dependent
     * 						upon. These errors are always detected by the application system. The application should
     * 						indicate the need for compensation in Severity and Status values. These errors may be transient
     * 						and consumers may choose to retry their request.
     * 					
     * 
     */
    @XmlEnumValue("Application")
    APPLICATION("Application"),

    /**
     * 
     * 						Business logic errors occur when a service provider is able to process the request message but
     * 						the request violates pre-condition or internal application business logic. Example business
     * 						logic errors are a request for flight information but the flight does not exist or a request to
     * 						reserve more seats than are on the aircraft. The response message will likely provide details
     * 						about the error condition and may or may not use a standard error response record. Business
     * 						logic errors are always detected by the application system. Applications must not make changes
     * 						that will require compensation when business logic errors are detected. These errors are caused
     * 						by content of the request; consumers should only attempt to retry their unmodified request if
     * 						the business condition described in the application specific response indicates the condition
     * 						may be transient. Service providers should use the ErrorMessage and code attribute to describe
     * 						the business condition and document those conditions in their service contract.
     * 					
     * 
     */
    @XmlEnumValue("BusinessLogic")
    BUSINESS_LOGIC("BusinessLogic");
    private final String value;

    ErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorType fromValue(String v) {
        for (ErrorType c: ErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
