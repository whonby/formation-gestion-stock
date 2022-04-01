package com.rg.gestionstock.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Builder
@Data
public class LigneCommandeFournisseursDto {

    private Integer id;
    private ArticlesDto articlesDto;


    private CommandeFournisseursDto commandeFournisseursDto;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

}
