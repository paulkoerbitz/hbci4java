
package org.kapott.hbci.sepa.jaxb.pain_001_002_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLevelSEPACode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceLevelSEPACode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEPA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceLevelSEPACode", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.002.03")
@XmlEnum
public enum ServiceLevelSEPACode {

    SEPA;

    public String value() {
        return name();
    }

    public static ServiceLevelSEPACode fromValue(String v) {
        return valueOf(v);
    }

}
