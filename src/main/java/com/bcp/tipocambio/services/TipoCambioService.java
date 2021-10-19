package com.bcp.tipocambio.services;

import com.bcp.tipocambio.models.pojo.TipoCambio;
import com.bcp.tipocambio.models.request.CambiarTCRequest;
import com.bcp.tipocambio.models.request.TipoCambioRequest;
import com.bcp.tipocambio.repositories.ITipoCambioRepository;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoCambioService implements ITipoCambioService{
    @Autowired
    private ITipoCambioRepository repository;

    @Override
    public Single<CambiarTCRequest> AplicarTipoCambio(CambiarTCRequest request) {
        return Single.just(repository.getTipoCambioByCurrency(request.getMonedaOrigen(),
                request.getMonedaDestino()))
                .map(d->{
                    request.setTipoCambio(d.getValor());
                    request.setMontoTipoCambio(request.getMonto()*d.getValor());
                    return request;
                });
    }

    @Override
    public Completable ActualizarTipoCambio(TipoCambioRequest request) {
        return Single.just(repository.getTipoCambioByCurrency(request.getMonedaOrigen(),
                request.getMonedaDestino()))
                .doOnSuccess(tipoCambio -> {
                    tipoCambio.setValor(request.getValor());
                    repository.save(tipoCambio);
                }).toCompletable();
    }

    @Override
    public Observable<TipoCambio> ListarTipoCambio() {
        return Observable.fromIterable(repository.findAll());
    }
}
