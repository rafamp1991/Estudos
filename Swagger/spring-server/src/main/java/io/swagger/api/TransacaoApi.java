/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Transacao;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-31T19:35:22.997Z")

@Api(value = "transacao", description = "the transacao API")
@RequestMapping(value = "/byteBank_api/v1")
public interface TransacaoApi {

    @ApiOperation(value = "Altera o valor da Transação", nickname = "alteraValorTransacao", notes = "Altera o valor da transação da conta do cliente", authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Alteração do valor efetuada com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro no servidor") })
    @RequestMapping(value = "/transacao/{codigo}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> alteraValorTransacao(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "valor", required = true) Double valor,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TransacaoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Cadastra Transação na Conta", nickname = "cadastraTransacao", notes = "Cadastra uma transação de débito ou depósito na conta.", response = Transacao.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Cadastro de transação efetuado com sucesso.", response = Transacao.class),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro no servidor") })
    @RequestMapping(value = "/transacao",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Transacao> cadastraTransacao(@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Transacao transacao,@NotNull @ApiParam(value = "", required = true, allowableValues = "debito, deposito") @Valid @RequestParam(value = "tipo", required = true) String tipo) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"tipo\" : \"debito\",  \"data\" : \"2000-01-23T04:56:07.000+00:00\",  \"valor\" : 6.027456183070403,  \"id\" : 0}", Transacao.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TransacaoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Exclui a Transação", nickname = "excluiTransacao", notes = "Exclusão da transação existente na conta do cliente", authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Transacao", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Transação excluida com sucesso"),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro no servidor") })
    @RequestMapping(value = "/transacao/{codigo}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> excluiTransacao(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TransacaoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
