package it.csi.stacore.staavvisisrv.api.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="valuta")

public class ValutaVO  implements Serializable {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  private static final long serialVersionUID = 1L;
  
  private Double importo = null;
  private DivisaVO divisa = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo") 
 
  public Double getImporto() {
    return importo;
  }
  public void setImporto(Double importo) {
    this.importo = importo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("divisa") 
 
  public DivisaVO getDivisa() {
    return divisa;
  }
  public void setDivisa(DivisaVO divisa) {
    this.divisa = divisa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValutaVO valutaVO = (ValutaVO) o;
    return Objects.equals(importo, valutaVO.importo) &&
        Objects.equals(divisa, valutaVO.divisa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importo, divisa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValutaVO {\n");
    
    sb.append("    importo: ").append(toIndentedString(importo)).append("\n");
    sb.append("    divisa: ").append(toIndentedString(divisa)).append("\n");
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

