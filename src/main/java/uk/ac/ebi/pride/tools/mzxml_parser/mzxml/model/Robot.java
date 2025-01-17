
package uk.ac.ebi.pride.tools.mzxml_parser.mzxml.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import uk.ac.ebi.pride.tools.mzxml_parser.mzxml.xml.util.NonNegativeIntegerAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="robotManufacturer" type="{<a href="http://sashimi.sourceforge.net/schema_revision/mzXML_3.2">...</a>}ontologyEntryType"/&gt;
 *         &lt;element name="robotModel" type="{<a href="http://sashimi.sourceforge.net/schema_revision/mzXML_3.2">...</a>}ontologyEntryType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="timePerSpot" use="required" type="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}duration" /&gt;
 *       &lt;attribute name="deadVolume" type="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "robotManufacturer",
    "robotModel"
})
public class Robot
    implements Serializable, MzXMLObject
{

    private final static long serialVersionUID = 320L;
    @XmlElement(required = true)
    protected OntologyEntry robotManufacturer;
    @XmlElement(required = true)
    protected OntologyEntry robotModel;
    @XmlAttribute(required = true)
    protected Duration timePerSpot;
    @XmlAttribute
    @XmlJavaTypeAdapter(NonNegativeIntegerAdapter.class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long deadVolume;

    /**
     * Gets the value of the robotManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyEntry }
     *     
     */
    public OntologyEntry getRobotManufacturer() {
        return robotManufacturer;
    }

    /**
     * Sets the value of the robotManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyEntry }
     *     
     */
    public void setRobotManufacturer(OntologyEntry value) {
        this.robotManufacturer = value;
    }

    /**
     * Gets the value of the robotModel property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyEntry }
     *     
     */
    public OntologyEntry getRobotModel() {
        return robotModel;
    }

    /**
     * Sets the value of the robotModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyEntry }
     *     
     */
    public void setRobotModel(OntologyEntry value) {
        this.robotModel = value;
    }

    /**
     * Gets the value of the timePerSpot property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimePerSpot() {
        return timePerSpot;
    }

    /**
     * Sets the value of the timePerSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimePerSpot(Duration value) {
        this.timePerSpot = value;
    }

    /**
     * Gets the value of the deadVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDeadVolume() {
        return deadVolume;
    }

    /**
     * Sets the value of the deadVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadVolume(Long value) {
        this.deadVolume = value;
    }

}
