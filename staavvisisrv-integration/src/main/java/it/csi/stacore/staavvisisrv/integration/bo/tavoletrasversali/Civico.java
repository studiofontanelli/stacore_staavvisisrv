/*
 * Created on 27-gen-2006
 */
package it.csi.stacore.staavvisisrv.integration.bo.tavoletrasversali;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import it.csi.stacore.staavvisisrv.integration.bo.AbstractBO;

/**
 * @author 71025
 */
public class Civico extends AbstractBO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4375625321276570108L;
	/**
		 * @uml.property  name="radice"
		 */
    private final Integer radice;
    /**
		 * @uml.property  name="stringaCivico"
		 */
    private final String stringaCivico;

    public Civico(Integer radice, String stringaCivico) {
        this.radice = radice;
        this.stringaCivico = stringaCivico;
    }

    /**
		 * @return  Returns the radice.
		 * @uml.property  name="radice"
		 */
    public Integer getRadice() {
        return radice;
    }

    /**
		 * @return  Returns the stringaCivico.
		 * @uml.property  name="stringaCivico"
		 */
    public String getStringaCivico() {
        return stringaCivico;
    }

    /**
     * Dato un civico in stringa , es "52 interno A" ne ritorna
     * solo la prima parte numerica (radice)
     */
    public final static Integer estraiRadiceFromCivicoInStringa(String civicoCompleto) {
    	if (StringUtils.isBlank(civicoCompleto)) return null;

    	Integer radice = null;

		for (int i = 1; i <= civicoCompleto.length(); i++) {
			String sub = StringUtils.substring(civicoCompleto, 0, i);
			if (StringUtils.isNumeric(sub)) {
				radice = new Integer(sub);
			} else {
				break;
			}
		}

    	return radice;
    }

    /**
     * Dato un civico in stringa , es "52 interno A" ne ritorna
     * solo la seconda parte stringa (estensione civico)
     */
    public final static String estraiEstensioneFromCivicoInStringa(String civicoCompleto) {
    	if (StringUtils.isBlank(civicoCompleto)) return null;

    	String estensione = null;

		for (int i = 1; i <= civicoCompleto.length(); i++) {
			String sub = StringUtils.substring(civicoCompleto, 0, i);
			if (StringUtils.isNumeric(sub)) {
				estensione = StringUtils.substring(civicoCompleto, i).trim();
			} else {
				break;
			}
		}

    	return StringUtils.trimToNull(estensione);
    }
    
//    public static void main(String[] args) {
//		System.out.println(Civico.estraiRadiceFromCivicoInStringa("6"));
//		System.out.println(Civico.estraiEstensioneFromCivicoInStringa("6    innns sss 11"));
//	}

}
