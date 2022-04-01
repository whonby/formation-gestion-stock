package com.rg.gestionstock.dto;

import lombok.Builder;
import lombok.Data;



@Builder
@Data
public class RolesDto {

    private Integer id;
    private String roleName;

    private UtilisateursDto utilisateursDto;
}
