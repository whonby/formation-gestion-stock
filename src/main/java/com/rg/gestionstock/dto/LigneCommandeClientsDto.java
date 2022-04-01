package com.rg.gestionstock.dto;


import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;


@Builder
@Data
public class LigneCommandeClientsDto {

    private Integer id;

    private ArticlesDto articlesDto;


    private CommandeClientsDto commandeClientsDto;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

}
