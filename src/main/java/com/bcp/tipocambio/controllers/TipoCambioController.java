package com.bcp.tipocambio.controllers;

import com.bcp.tipocambio.models.pojo.TipoCambio;
import com.bcp.tipocambio.models.request.CambiarTCRequest;
import com.bcp.tipocambio.models.request.TipoCambioRequest;
import com.bcp.tipocambio.services.ITipoCambioService;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TipoCambioController {
    @Autowired
    private ITipoCambioService servicio;

    @PostMapping(value = "/v1/tipo-cambio/cambiar")
    public Single<CambiarTCRequest> CambiarTipoCambio(@RequestBody CambiarTCRequest request){
        return servicio.AplicarTipoCambio(request);
    }

    @PutMapping(value = "/v1/tipo-cambio/actualizar")
    public Completable ActualizarTipoCambio(@RequestBody TipoCambioRequest request){
        return servicio.ActualizarTipoCambio(request);
    }

    @GetMapping(value = "/v1/tipo-cambio/listar")
    public Observable<TipoCambio> ListarTipoCambio(){
        return servicio.ListarTipoCambio();
    }
}
