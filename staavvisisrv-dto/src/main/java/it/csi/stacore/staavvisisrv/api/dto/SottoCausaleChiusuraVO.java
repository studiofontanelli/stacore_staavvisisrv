package it.csi.stacore.staavvisisrv.api.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="sotto causale chiusura")

public class SottoCausaleChiusuraVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idSottoCausaleChiusura = null;
  private Long idCausaleChiusura = null;
  private String descrizione = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_sotto_causale_chiusura") 
 
  public Long getIdSottoCausaleChiusura() {
    return idSottoCausaleChiusura;
  }
  public void setIdSottoCausaleChiusura(Long idSottoCausaleChiusura) {
    this.idSottoCausaleChiusura = idSottoCausaleChiusura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id_causale_chiusura") 
 
  public Long getIdCausaleChiusura() {
    return idCausaleChiusura;
  }
  public void setIdCausaleChiusura(Long idCausaleChiusura) {
    this.idCausaleChiusura = idCausaleChiusura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SottoCausaleChiusuraVO sottoCausaleChiusuraVO = (SottoCausaleChiusuraVO) o;
    return Objects.equals(idSottoCausaleChiusura, sottoCausaleChiusuraVO.idSottoCausaleChiusura) &&
        Objects.equals(idCausaleChiusura, sottoCausaleChiusuraVO.idCausaleChiusura) &&
        Objects.equals(descrizione, sottoCausaleChiusuraVO.descrizione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSottoCausaleChiusura, idCausaleChiusura, descrizione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SottoCausaleChiusuraVO {\n");
    
    sb.append("    idSottoCausaleChiusura: ").append(toIndentedString(idSottoCausaleChiusura)).append("\n");
    sb.append("    idCausaleChiusura: ").append(toIndentedString(idCausaleChiusura)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
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

