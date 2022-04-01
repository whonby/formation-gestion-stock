package com.rg.gestionstock.dto;


import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class VentesDto {

    private Integer id;
    private String code;

    private Instant dateVente;

    private String commantaire;
}
