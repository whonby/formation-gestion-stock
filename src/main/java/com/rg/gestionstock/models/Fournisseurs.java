package com.rg.gestionstock.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="fournisseurs")
public class Fournisseurs extends AbstractEntity {

	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Embedded
	private Adresses adresse;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telephone")
	private String telephone;
	
	@OneToMany(mappedBy="fournisseur")
	private List<CommandeFournisseurs> commandeFournisseur;
}
