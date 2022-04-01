package com.rg.gestionstock.dto;

import com.rg.gestionstock.models.Category;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;

@Builder
@Data
public class ArticlesDto {


    private Integer id;
    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private CategoryDto categoryDto;
}
