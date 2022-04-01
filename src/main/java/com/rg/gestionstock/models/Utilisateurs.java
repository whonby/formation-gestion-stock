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
@Table(name="utilisateurs")
public class Utilisateurs extends AbstractEntity {


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

	@Column(name="motdepasse")
	private String moteDePasse;

	@ManyToOne
	@JoinColumn(name = "entreprise_id")
	private Entreprises entreprises;

	@OneToMany(mappedBy = "utilisateurs")
	private List<Roles> roles;
}
