package com.rg.gestionstock.dto;


import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeClientsDto {


    private Integer id;
    private String code;


    private Instant dateCommande;


    private ClientsDto clientsDto;


    private List<LigneCommandeClientsDto> ligneCommandeClientsDtos;
}
