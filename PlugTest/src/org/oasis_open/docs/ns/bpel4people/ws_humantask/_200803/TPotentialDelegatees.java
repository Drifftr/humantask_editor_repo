//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.22 at 06:17:49 PM IST 
//


package org.oasis_open.docs.ns.bpel4people.ws_humantask._200803;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPotentialDelegatees.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tPotentialDelegatees">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anybody"/>
 *     &lt;enumeration value="nobody"/>
 *     &lt;enumeration value="potentialOwners"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tPotentialDelegatees")
@XmlEnum
public enum TPotentialDelegatees {

    @XmlEnumValue("anybody")
    ANYBODY("anybody"),
    @XmlEnumValue("nobody")
    NOBODY("nobody"),
    @XmlEnumValue("potentialOwners")
    POTENTIAL_OWNERS("potentialOwners"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TPotentialDelegatees(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPotentialDelegatees fromValue(String v) {
        for (TPotentialDelegatees c: TPotentialDelegatees.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
