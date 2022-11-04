package it.csi.stacore.staavvisisrv.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="avviso accertamento ente")

public class AvvisoAccertamentoEnteVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idAvvisoAccertamentoEnte = null;
  private Long idEnte = null;
  private Integer annoAccertamento = null;
  private TipoAvvisoAccertamentoVO tipoAvvisoAccertamento = null;
  private Date dataElaborazione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_avviso_accertamento_ente") 
 
  public Long getIdAvvisoAccertamentoEnte() {
    return idAvvisoAccertamentoEnte;
  }
  public void setIdAvvisoAccertamentoEnte(Long idAvvisoAccertamentoEnte) {
    this.idAvvisoAccertamentoEnte = idAvvisoAccertamentoEnte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_ente") 
 
  public Long getIdEnte() {
    return idEnte;
  }
  public void setIdEnte(Long idEnte) {
    this.idEnte = idEnte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
  @JsonProperty("tipo_avviso_accertamento") 
 
  public TipoAvvisoAccertamentoVO getTipoAvvisoAccertamento() {
    return tipoAvvisoAccertamento;
  }
  public void setTipoAvvisoAccertamento(TipoAvvisoAccertamentoVO tipoAvvisoAccertamento) {
    this.tipoAvvisoAccertamento = tipoAvvisoAccertamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_elaborazione") 
 
  public Date getDataElaborazione() {
    return dataElaborazione;
  }
  public void setDataElaborazione(Date dataElaborazione) {
    this.dataElaborazione = dataElaborazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvvisoAccertamentoEnteVO avvisoAccertamentoEnteVO = (AvvisoAccertamentoEnteVO) o;
    return Objects.equals(idAvvisoAccertamentoEnte, avvisoAccertamentoEnteVO.idAvvisoAccertamentoEnte) &&
        Objects.equals(idEnte, avvisoAccertamentoEnteVO.idEnte) &&
        Objects.equals(annoAccertamento, avvisoAccertamentoEnteVO.annoAccertamento) &&
        Objects.equals(tipoAvvisoAccertamento, avvisoAccertamentoEnteVO.tipoAvvisoAccertamento) &&
        Objects.equals(dataElaborazione, avvisoAccertamentoEnteVO.dataElaborazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAvvisoAccertamentoEnte, idEnte, annoAccertamento, tipoAvvisoAccertamento, dataElaborazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvvisoAccertamentoEnteVO {\n");
    
    sb.append("    idAvvisoAccertamentoEnte: ").append(toIndentedString(idAvvisoAccertamentoEnte)).append("\n");
    sb.append("    idEnte: ").append(toIndentedString(idEnte)).append("\n");
    sb.append("    annoAccertamento: ").append(toIndentedString(annoAccertamento)).append("\n");
    sb.append("    tipoAvvisoAccertamento: ").append(toIndentedString(tipoAvvisoAccertamento)).append("\n");
    sb.append("    dataElaborazione: ").append(toIndentedString(dataElaborazione)).append("\n");
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

