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
@Table(name="commande_clients")
public class CommandeClients extends AbstractEntity {

	@Column(name="code")
	private String code;
	
	@Column(name="date_commande")
	private Instant dateCommande;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Clients clients;
	
	@OneToMany(mappedBy="commandeClient")
	private List<LigneCommandeClients> ligneCommandeClients;

}
