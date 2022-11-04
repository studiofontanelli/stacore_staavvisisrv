package it.csi.stacore.staavvisisrv.api.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="fields applicati nella ricerca")

public class RicercaAvvisoAccertamentoVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private String identificativoFiscale = null;
  private String protocollo = null;
  private String targa = null;
  private String tipoVeicolo = null;
  private String scadenza = null;
  private Integer validta = null;
  private Integer annoAccertamento = null;
  private String identificativoUtente = null;
  private String statoAccertamento = null;

  /**
   * codice fiscale
   **/
  
  @ApiModelProperty(value = "codice fiscale")
  @JsonProperty("identificativo_fiscale") 
 
  public String getIdentificativoFiscale() {
    return identificativoFiscale;
  }
  public void setIdentificativoFiscale(String identificativoFiscale) {
    this.identificativoFiscale = identificativoFiscale;
  }

  /**
   * numero protocollo
   **/
  
  @ApiModelProperty(value = "numero protocollo")
  @JsonProperty("protocollo") 
 
  public String getProtocollo() {
    return protocollo;
  }
  public void setProtocollo(String protocollo) {
    this.protocollo = protocollo;
  }

  /**
   * targa veicolo
   **/
  
  @ApiModelProperty(value = "targa veicolo")
  @JsonProperty("targa") 
 
  public String getTarga() {
    return targa;
  }
  public void setTarga(String targa) {
    this.targa = targa;
  }

  /**
   * tipo veicolo
   **/
  
  @ApiModelProperty(value = "tipo veicolo")
  @JsonProperty("tipo_veicolo") 
 
  public String getTipoVeicolo() {
    return tipoVeicolo;
  }
  public void setTipoVeicolo(String tipoVeicolo) {
    this.tipoVeicolo = tipoVeicolo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scadenza") 
 
  public String getScadenza() {
    return scadenza;
  }
  public void setScadenza(String scadenza) {
    this.scadenza = scadenza;
  }

  /**
   * validita
   **/
  
  @ApiModelProperty(value = "validita")
  @JsonProperty("validta") 
 
  public Integer getValidta() {
    return validta;
  }
  public void setValidta(Integer validta) {
    this.validta = validta;
  }

  /**
   * anno accertamento
   **/
  
  @ApiModelProperty(value = "anno accertamento")
  @JsonProperty("anno_accertamento") 
 
  public Integer getAnnoAccertamento() {
    return annoAccertamento;
  }
  public void setAnnoAccertamento(Integer annoAccertamento) {
    this.annoAccertamento = annoAccertamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identificativo_utente") 
 
  public String getIdentificativoUtente() {
    return identificativoUtente;
  }
  public void setIdentificativoUtente(String identificativoUtente) {
    this.identificativoUtente = identificativoUtente;
  }

  /**
   * stato accertamento
   **/
  
  @ApiModelProperty(value = "stato accertamento")
  @JsonProperty("stato_accertamento") 
 
  public String getStatoAccertamento() {
    return statoAccertamento;
  }
  public void setStatoAccertamento(String statoAccertamento) {
    this.statoAccertamento = statoAccertamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RicercaAvvisoAccertamentoVO ricercaAvvisoAccertamentoVO = (RicercaAvvisoAccertamentoVO) o;
    return Objects.equals(identificativoFiscale, ricercaAvvisoAccertamentoVO.identificativoFiscale) &&
        Objects.equals(protocollo, ricercaAvvisoAccertamentoVO.protocollo) &&
        Objects.equals(targa, ricercaAvvisoAccertamentoVO.targa) &&
        Objects.equals(tipoVeicolo, ricercaAvvisoAccertamentoVO.tipoVeicolo) &&
        Objects.equals(scadenza, ricercaAvvisoAccertamentoVO.scadenza) &&
        Objects.equals(validta, ricercaAvvisoAccertamentoVO.validta) &&
        Objects.equals(annoAccertamento, ricercaAvvisoAccertamentoVO.annoAccertamento) &&
        Objects.equals(identificativoUtente, ricercaAvvisoAccertamentoVO.identificativoUtente) &&
        Objects.equals(statoAccertamento, ricercaAvvisoAccertamentoVO.statoAccertamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificativoFiscale, protocollo, targa, tipoVeicolo, scadenza, validta, annoAccertamento, identificativoUtente, statoAccertamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RicercaAvvisoAccertamentoVO {\n");
    
    sb.append("    identificativoFiscale: ").append(toIndentedString(identificativoFiscale)).append("\n");
    sb.append("    protocollo: ").append(toIndentedString(protocollo)).append("\n");
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    tipoVeicolo: ").append(toIndentedString(tipoVeicolo)).append("\n");
    sb.append("    scadenza: ").append(toIndentedString(scadenza)).append("\n");
    sb.append("    validta: ").append(toIndentedString(validta)).append("\n");
    sb.append("    annoAccertamento: ").append(toIndentedString(annoAccertamento)).append("\n");
    sb.append("    identificativoUtente: ").append(toIndentedString(identificativoUtente)).append("\n");
    sb.append("    statoAccertamento: ").append(toIndentedString(statoAccertamento)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

