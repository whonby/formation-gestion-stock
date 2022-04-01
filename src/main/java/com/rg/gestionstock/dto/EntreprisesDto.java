package com.rg.gestionstock.dto;


import lombok.Builder;
import lombok.Data;


import java.util.List;


@Builder
@Data
public class EntreprisesDto {


    private Integer id;
    private String nom;


    private String description;


    private AdressesDto adressesDto;

    private String codeFiscal;


    private String photo;


    private String email;

    private String telephone;


    private String siteWeb;


    private List<UtilisateursDto> utilisateursDtos;
}
