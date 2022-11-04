package it.csi.stacore.staavvisisrv.integration.bo.common;

import java.io.Serializable;
import java.util.Date;

import it.csi.stacore.staavvisisrv.integration.bo.id.IdDecodifica;

public abstract class DecodificaDatata extends Decodifica implements Serializable, Comparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date dataInizio;

	private Date dataFine;

	public DecodificaDatata(IdDecodifica id, String descrizione, String codice,
			Date dataInizio, Date dataFine) {
		super(id, descrizione, codice);
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}
}
