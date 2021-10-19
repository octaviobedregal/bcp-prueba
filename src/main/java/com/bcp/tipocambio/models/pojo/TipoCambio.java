package com.bcp.tipocambio.models.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tipocambio")
@Getter
@Setter
public class TipoCambio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name="moneda_origen")
    private String monedaOrigen;
    @Column(name="moneda_destino")
    private String monedaDestino;
    @Column(name="valor")
    private Double valor;
}

