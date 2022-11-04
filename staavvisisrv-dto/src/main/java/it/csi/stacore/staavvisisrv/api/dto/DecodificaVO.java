package it.csi.stacore.staavvisisrv.api.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Decodifica")

public class DecodificaVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Long idDecodifica = null;
  private String descrizione = null;
  private String codice = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idDecodifica") 
 
  public Long getIdDecodifica() {
    return idDecodifica;
  }
  public void setIdDecodifica(Long idDecodifica) {
    this.idDecodifica = idDecodifica;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodificaVO decodificaVO = (DecodificaVO) o;
    return Objects.equals(idDecodifica, decodificaVO.idDecodifica) &&
        Objects.equals(descrizione, decodificaVO.descrizione) &&
        Objects.equals(codice, decodificaVO.codice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDecodifica, descrizione, codice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodificaVO {\n");
    
    sb.append("    idDecodifica: ").append(toIndentedString(idDecodifica)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
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

