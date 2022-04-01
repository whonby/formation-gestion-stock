package com.rg.gestionstock.models;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="entreprises")
public class Entreprises extends AbstractEntity {

    @Column(name="nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Embedded
    private Adresses adresses;

    @Column(name="code_fiscal")
    private String codeFiscal;

    @Column(name="photo")
    private String photo;

    @Column(name="email")
    private String email;

    @Column(name="telephone")
    private String telephone;

    @Column(name="site_web")
    private String siteWeb;

    @OneToMany(mappedBy = "entreprises")
    private List<Utilisateurs> utilisateurs;
}
