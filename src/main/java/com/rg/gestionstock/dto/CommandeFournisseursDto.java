package com.rg.gestionstock.dto;


import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeFournisseursDto {

    private Integer id;
    private String code;


    private Instant dateCommande;


    private FournisseursDto fournisseursDto;


    private List<LigneCommandeFournisseursDto> ligneCommandeFournisseursDtos;
}
