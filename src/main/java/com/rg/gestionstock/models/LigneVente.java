package com.rg.gestionstock.models;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="ligne_vente")
public class LigneVente extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name="vente_id")
	private Ventes vente;

	@Column(name = "quantite")
	private BigDecimal quantite;

	@Column(name = "prixunitaire")
	private BigDecimal prixUnitaire;
}
