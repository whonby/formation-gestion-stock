package com.rg.gestionstock.dto;

import com.rg.gestionstock.models.TypeMvtStk;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStkDto {

    private Integer id;
    private Instant dateMvt;

    private BigDecimal quantite;


    private ArticlesDto articlesDto;

    private TypeMvtStk typeMvtStk;
}
