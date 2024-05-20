package org.sofka.api.cuenta.bancaria.cliente.controller.dto.salida;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <b> Clase comun de respuesta para los ws. </b>
 *
 * @author Jenny Pucha
 * @version $Revision: 1.0 $
 *     <p>
 *     [$Author: Jenny Pucha $, $Date: 21 abr. 2024 $]
 *     </p>
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponseDto<T> {

    @Builder.Default
    private Integer code = 200;
    private String message;
    private List<String> errors;
    private T data;
}
