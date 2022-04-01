package com.rg.gestionstock.dto;



import lombok.Builder;
import lombok.Data;


import java.util.List;

@Builder
@Data
public class ClientsDto {

    private Integer id;
    private String nom;


    private String prenom;


    private AdressesDto adressesDto;


    private String photo;


    private String email;


    private String telephone;


    private List<CommandeClientsDto> commandeClientsDtos;
}
