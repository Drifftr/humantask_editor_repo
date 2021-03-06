//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.22 at 06:17:49 PM IST 
//


package org.oasis_open.docs.ns.bpel4people.ws_humantask._200803;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tMessageChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessageChoice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="messageDisplay" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/200803}tMessageDisplay" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMessageChoice", propOrder = {
    "messageDisplay"
})
public class TMessageChoice
    extends TExtensibleElements
{

    @XmlElement(required = true)
    protected List<TMessageDisplay> messageDisplay;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String value;

    /**
     * Gets the value of the messageDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMessageDisplay }
     * 
     * 
     */
    public List<TMessageDisplay> getMessageDisplay() {
        if (messageDisplay == null) {
            messageDisplay = new ArrayList<TMessageDisplay>();
        }
        return this.messageDisplay;
    }

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

}
