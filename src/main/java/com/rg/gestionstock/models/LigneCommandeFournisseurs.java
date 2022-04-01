package com.rg.gestionstock.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="ligne_commande_fournisseurs")
public class LigneCommandeFournisseurs extends AbstractEntity {

	
	@ManyToOne
	@JoinColumn(name="article_id")
	private Articles articles;
	
	@ManyToOne
	@JoinColumn(name="commande_fournisseur_id")
	private CommandeFournisseurs commandeFournisseur;


	@Column(name = "quantite")
	private BigDecimal quantite;

	@Column(name = "prixunitaire")
	private BigDecimal prixUnitaire;
}
