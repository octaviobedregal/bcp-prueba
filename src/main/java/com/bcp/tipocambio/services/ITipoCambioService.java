package com.bcp.tipocambio.services;

import com.bcp.tipocambio.models.pojo.TipoCambio;
import com.bcp.tipocambio.models.request.CambiarTCRequest;
import com.bcp.tipocambio.models.request.TipoCambioRequest;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;

public interface ITipoCambioService {
    public Single<CambiarTCRequest> AplicarTipoCambio(CambiarTCRequest request);
    public Completable ActualizarTipoCambio(TipoCambioRequest request);
    public Observable<TipoCambio> ListarTipoCambio();
}
