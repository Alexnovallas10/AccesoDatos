//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.23 a las 05:44:29 PM CET 
//


package jabxClasesC;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Canciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Canciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaCancion" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="artista" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="duracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="bo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Canciones", propOrder = {
    "listaCancion"
})
public class Canciones {

    @XmlElement(required = true)
    protected List<Canciones.ListaCancion> listaCancion;

    /**
     * Gets the value of the listaCancion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCancion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCancion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canciones.ListaCancion }
     * 
     * 
     */
    public List<Canciones.ListaCancion> getListaCancion() {
        if (listaCancion == null) {
            listaCancion = new ArrayList<Canciones.ListaCancion>();
        }
        return this.listaCancion;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="artista" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="duracion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="bo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "anio",
        "titulo",
        "artista",
        "duracion",
        "bo"
    })
    public static class ListaCancion {

        @XmlElement(required = true)
        protected BigInteger id;
        @XmlElement(required = true)
        protected BigInteger anio;
        @XmlElement(required = true)
        protected String titulo;
        @XmlElement(required = true)
        protected String artista;
        @XmlElement(required = true)
        protected String duracion;
        protected boolean bo;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad anio.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAnio() {
            return anio;
        }

        /**
         * Define el valor de la propiedad anio.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAnio(BigInteger value) {
            this.anio = value;
        }

        /**
         * Obtiene el valor de la propiedad titulo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitulo() {
            return titulo;
        }

        /**
         * Define el valor de la propiedad titulo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitulo(String value) {
            this.titulo = value;
        }

        /**
         * Obtiene el valor de la propiedad artista.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArtista() {
            return artista;
        }

        /**
         * Define el valor de la propiedad artista.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArtista(String value) {
            this.artista = value;
        }

        /**
         * Obtiene el valor de la propiedad duracion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuracion() {
            return duracion;
        }

        /**
         * Define el valor de la propiedad duracion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuracion(String value) {
            this.duracion = value;
        }

        /**
         * Obtiene el valor de la propiedad bo.
         * 
         */
        public boolean isBo() {
            return bo;
        }

        /**
         * Define el valor de la propiedad bo.
         * 
         */
        public void setBo(boolean value) {
            this.bo = value;
        }

    }

}
