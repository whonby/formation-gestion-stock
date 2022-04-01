package com.rg.gestionstock.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class UtilisateursDto {

    private Integer id;
    private String nom;

    private String prenom;


    private AdressesDto adressesDto;


    private String photo;


    private String email;


    private String telephone;

    private String moteDePasse;


    private EntreprisesDto entreprisesDto;


    private List<RolesDto> rolesDtos;
}
