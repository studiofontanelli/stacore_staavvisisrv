package it.csi.stacore.staavvisisrv.integration.bo.avvisoaccertamento;

import java.io.Serializable;
import java.util.Date;

import it.csi.stacore.staavvisisrv.integration.bo.id.IdAvvisoAccertamentoEnte;
import it.csi.stacore.staavvisisrv.integration.util.EqualsUtil;

public class AvvisoAccertamentoEnte implements Serializable {
	static final long serialVersionUID = 889959897946401369L;

	/**
	 * @uml.property  name="idAvvisoAccertamentoEnte"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private IdAvvisoAccertamentoEnte idAvvisoAccertamentoEnte = null;
	/**
	 * @uml.property  name="idEnte"
	 */
	private Integer idEnte = null;
	/**
	 * @uml.property  name="annoAccertamento"
	 */
	private Integer annoAccertamento = null;
	/**
	 * @uml.property  name="tipoAvvisoAccertamento"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private TipoAvvisoAccertamento tipoAvvisoAccertamento = null;
	/**
	 * @uml.property  name="dataElaborazione"
	 */
	private Date dataElaborazione = null;

	public AvvisoAccertamentoEnte(IdAvvisoAccertamentoEnte idAvvisoAccertamentoEnte,Integer idEnte,
	        Integer annoAccertamento, TipoAvvisoAccertamento tipoAvvisoAccertamento,
			Date dataElaborazione) {
		this.idAvvisoAccertamentoEnte = idAvvisoAccertamentoEnte;
		this.idEnte = idEnte;
		this.annoAccertamento = annoAccertamento;
		this.tipoAvvisoAccertamento = tipoAvvisoAccertamento;
		this.dataElaborazione = dataElaborazione;
	}

	/**
	 * @return  Returns the annoAccertamento.
	 * @uml.property  name="annoAccertamento"
	 */
	public Integer getAnnoAccertamento() {
		return annoAccertamento;
	}
	/**
	 * @param annoAccertamento  The annoAccertamento to set.
	 * @uml.property  name="annoAccertamento"
	 */
	public void setAnnoAccertamento(Integer annoAccertamento) {
		this.annoAccertamento = annoAccertamento;
	}
	/**
	 * @return  Returns the dataElaborazione.
	 * @uml.property  name="dataElaborazione"
	 */
	public Date getDataElaborazione() {
		return dataElaborazione;
	}
	/**
	 * @param dataElaborazione  The dataElaborazione to set.
	 * @uml.property  name="dataElaborazione"
	 */
	public void setDataElaborazione(Date dataElaborazione) {
		this.dataElaborazione = dataElaborazione;
	}

	/**
	 * @return  Returns the idAvvisoAccertamentoEnte.
	 * @uml.property  name="idAvvisoAccertamentoEnte"
	 */
	public IdAvvisoAccertamentoEnte getIdAvvisoAccertamentoEnte() {
		return idAvvisoAccertamentoEnte;
	}
	/**
	 * @param idAvvisoAccertamentoEnte  The idAvvisoAccertamentoEnte to set.
	 * @uml.property  name="idAvvisoAccertamentoEnte"
	 */
	public void setIdAvvisoAccertamentoEnte(
			IdAvvisoAccertamentoEnte idAvvisoAccertamentoEnte) {
		this.idAvvisoAccertamentoEnte = idAvvisoAccertamentoEnte;
	}
	/**
	 * @return  Returns the idEnte.
	 * @uml.property  name="idEnte"
	 */
	public Integer getIdEnte() {
		return idEnte;
	}
	/**
	 * @param idEnte  The idEnte to set.
	 * @uml.property  name="idEnte"
	 */
	public void setIdEnte(Integer idEnte) {
		this.idEnte = idEnte;
	}
	/**
	 * @return  Returns the tipoAvvisoAccertamento.
	 * @uml.property  name="tipoAvvisoAccertamento"
	 */
	public TipoAvvisoAccertamento getTipoAvvisoAccertamento() {
		return tipoAvvisoAccertamento;
	}
	/**
	 * @param tipoAvvisoAccertamento  The tipoAvvisoAccertamento to set.
	 * @uml.property  name="tipoAvvisoAccertamento"
	 */
	public void setTipoAvvisoAccertamento(
			TipoAvvisoAccertamento tipoAvvisoAccertamento) {
		this.tipoAvvisoAccertamento = tipoAvvisoAccertamento;
	}

	public boolean equals(Object object) {
		boolean equals = false;

		if ((object != null) && object instanceof AvvisoAccertamentoEnte) {
			AvvisoAccertamentoEnte altro = (AvvisoAccertamentoEnte) object;
			equals = EqualsUtil.objectEquals(getAnnoAccertamento(),altro.getAnnoAccertamento()) &&
			EqualsUtil.objectEquals(getDataElaborazione(),altro.getDataElaborazione()) &&
			EqualsUtil.objectEquals(getIdAvvisoAccertamentoEnte(),altro.getIdAvvisoAccertamentoEnte()) &&
			EqualsUtil.objectEquals(getIdEnte(),altro.getIdEnte()) &&
			EqualsUtil.objectEquals(getTipoAvvisoAccertamento(),altro.getTipoAvvisoAccertamento());
		}

		return equals;
	}

}
