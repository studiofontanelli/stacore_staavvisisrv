package it.csi.stacore.staavvisisrv.integration.bo.credito;

import it.csi.stacore.staavvisisrv.integration.bo.id.LongId;
import it.csi.stacore.staavvisisrv.integration.bo.veicolo.TipoVeicolo;

public interface Compensato {
	public abstract LongId getIdCompensato();

	public abstract TipoErogazione getTipoErogazione();

	public abstract String getTargaCompensato();

	public abstract TipoVeicolo getTipoVeicoloCompensato();

	public abstract Integer getScadenzaCompensato();

	public abstract Integer getValiditaCompensato();
}
