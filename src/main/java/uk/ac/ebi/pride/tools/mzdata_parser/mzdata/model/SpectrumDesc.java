
package uk.ac.ebi.pride.tools.mzdata_parser.mzdata.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the process of performing an acquisition
 *
 * <p>Java class for spectrumDescType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="spectrumDescType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spectrumSettings" type="{}spectrumSettingsType"/&gt;
 *         &lt;element name="precursorList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="precursor" type="{}precursorType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="count" use="required" type="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="comments" type="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spectrumDescType", propOrder = {
    "spectrumSettings",
    "precursorList",
    "comments"
})
public class SpectrumDesc
    implements Serializable, MzDataObject
{

    private final static long serialVersionUID = 105L;
    @XmlElement(required = true)
    protected SpectrumSettings spectrumSettings;
    protected SpectrumDesc.PrecursorList precursorList;
    protected List<String> comments;

    /**
     * Gets the value of the spectrumSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SpectrumSettings }
     *     
     */
    public SpectrumSettings getSpectrumSettings() {
        return spectrumSettings;
    }

    /**
     * Sets the value of the spectrumSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpectrumSettings }
     *     
     */
    public void setSpectrumSettings(SpectrumSettings value) {
        this.spectrumSettings = value;
    }

    /**
     * Gets the value of the precursorList property.
     * 
     * @return
     *     possible object is
     *     {@link SpectrumDesc.PrecursorList }
     *     
     */
    public SpectrumDesc.PrecursorList getPrecursorList() {
        return precursorList;
    }

    /**
     * Sets the value of the precursorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpectrumDesc.PrecursorList }
     *     
     */
    public void setPrecursorList(SpectrumDesc.PrecursorList value) {
        this.precursorList = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComments() {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        return this.comments;
    }


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
     *         &lt;element name="precursor" type="{}precursorType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="count" use="required" type="{<a href="http://www.w3.org/2001/XMLSchema">...</a>}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "precursor"
    })
    public static class PrecursorList
        implements Serializable, MzDataObject
    {

        private final static long serialVersionUID = 105L;
        @XmlElement(required = true)
        protected List<Precursor> precursor;
        @XmlAttribute(required = true)
        protected int count;

        /**
         * Gets the value of the precursor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the precursor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrecursor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Precursor }
         * 
         * 
         */
        public List<Precursor> getPrecursor() {
            if (precursor == null) {
                precursor = new ArrayList<>();
            }
            return this.precursor;
        }

        /**
         * Gets the value of the count property.
         * 
         */
        public int getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         */
        public void setCount(int value) {
            this.count = value;
        }

    }

}
