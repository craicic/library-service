//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.02.23 à 03:45:54 PM CET 
//


package com.gg.proj.service.loans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour loan complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="loan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bookId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loanStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="loanEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="extended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loan", propOrder = {
    "id",
    "userId",
    "bookId",
    "loanStartDate",
    "loanEndDate",
    "extended"
})
public class Loan {

    protected int id;
    protected int userId;
    protected int bookId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loanStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loanEndDate;
    protected boolean extended;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété userId.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Définit la valeur de la propriété userId.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Obtient la valeur de la propriété bookId.
     * 
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * Définit la valeur de la propriété bookId.
     * 
     */
    public void setBookId(int value) {
        this.bookId = value;
    }

    /**
     * Obtient la valeur de la propriété loanStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanStartDate() {
        return loanStartDate;
    }

    /**
     * Définit la valeur de la propriété loanStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanStartDate(XMLGregorianCalendar value) {
        this.loanStartDate = value;
    }

    /**
     * Obtient la valeur de la propriété loanEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanEndDate() {
        return loanEndDate;
    }

    /**
     * Définit la valeur de la propriété loanEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanEndDate(XMLGregorianCalendar value) {
        this.loanEndDate = value;
    }

    /**
     * Obtient la valeur de la propriété extended.
     * 
     */
    public boolean isExtended() {
        return extended;
    }

    /**
     * Définit la valeur de la propriété extended.
     * 
     */
    public void setExtended(boolean value) {
        this.extended = value;
    }

}