package com.bcp.tipocambio.models.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoCambioRequest {
    private String monedaOrigen;
    private String monedaDestino;
    private Double valor;
}

