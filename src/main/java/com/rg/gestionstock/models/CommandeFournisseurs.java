package com.rg.gestionstock.models;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="commande_fournisseur")
public class CommandeFournisseurs extends AbstractEntity {

	@Column(name="code")
	private String code;
	
	@Column(name="date_commande")
	private Instant dateCommande;
	
	@ManyToOne
	@JoinColumn(name="fournisseur_id")
	private Fournisseurs fournisseur;
	
	@OneToMany(mappedBy="commandeFournisseur")
	private List<LigneCommandeFournisseurs> ligneCommandeFournisseurs;
}
