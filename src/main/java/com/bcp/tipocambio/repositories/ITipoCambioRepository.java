package com.bcp.tipocambio.repositories;

import com.bcp.tipocambio.models.pojo.TipoCambio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoCambioRepository extends CrudRepository<TipoCambio, Integer> {
    @Query(value = "select * from tipocambio " +
            "where moneda_origen in (:monedaOrigen) and " +
            "moneda_destino in (:monedaDestino)", nativeQuery = true)
    TipoCambio getTipoCambioByCurrency(@Param("monedaOrigen") String monedaOrigen,
                                               @Param("monedaDestino") String monedaDestino);
}
