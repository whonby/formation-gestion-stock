package com.rg.gestionstock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {

    private Integer id;
    private VentesDto ventesDto;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
