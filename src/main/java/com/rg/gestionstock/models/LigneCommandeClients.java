package com.rg.gestionstock.models;

import javax.persistence.*;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="ligne_commande_clients")
public class LigneCommandeClients extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name="article_id")
	private Articles articles;
	
	@ManyToOne
	@JoinColumn(name="commande_client_id")
	private CommandeClients commandeClient;

	@Column(name = "quantite")
	private BigDecimal quantite;

	@Column(name = "prixunitaire")
	private BigDecimal prixUnitaire;
}
