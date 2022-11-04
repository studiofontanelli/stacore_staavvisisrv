/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.stacore.staavvisisrv.api.service;

import it.csi.stacore.staavvisisrv.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.stacore.staavvisisrv.api.dto.AvvisoAccertamentoVO;
import it.csi.stacore.staavvisisrv.api.dto.ErrorDto;
import it.csi.stacore.staavvisisrv.api.dto.RicercaAvvisoAccertamentoVO;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/avvisi-accertamento")


@io.swagger.annotations.Api(description = "the avvisi-accertamento API")

public interface AvvisiAccertamentoApi  {
   
    @POST
    @Path("/_search")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Avvisi Accertamento", notes = "carica lista accertamenti", response = AvvisoAccertamentoVO.class, tags={ "avvisi-accertamento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = AvvisoAccertamentoVO.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response findAvvisiAccertamento(@ApiParam(value = "" ,required=true) RicercaAvvisoAccertamentoVO searchParams,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
