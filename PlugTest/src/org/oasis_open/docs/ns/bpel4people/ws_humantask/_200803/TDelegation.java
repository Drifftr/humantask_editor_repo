//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.22 at 06:17:49 PM IST 
//


package org.oasis_open.docs.ns.bpel4people.ws_humantask._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDelegation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDelegation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="from" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tFrom" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="potentialDelegatees" use="required" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tPotentialDelegatees" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDelegation", propOrder = {
    "from"
})
public class TDelegation
    extends TExtensibleElements
{

    protected TFrom from;
    @XmlAttribute(required = true)
    protected TPotentialDelegatees potentialDelegatees;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link TFrom }
     *     
     */
    public TFrom getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFrom }
     *     
     */
    public void setFrom(TFrom value) {
        this.from = value;
    }

    /**
     * Gets the value of the potentialDelegatees property.
     * 
     * @return
     *     possible object is
     *     {@link TPotentialDelegatees }
     *     
     */
    public TPotentialDelegatees getPotentialDelegatees() {
        return potentialDelegatees;
    }

    /**
     * Sets the value of the potentialDelegatees property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPotentialDelegatees }
     *     
     */
    public void setPotentialDelegatees(TPotentialDelegatees value) {
        this.potentialDelegatees = value;
    }

}
