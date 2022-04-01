package com.rg.gestionstock.models;

import javax.persistence.*;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="roles")
public class Roles extends AbstractEntity {

	@Column(name="rolename")
	private String roleName;

	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	private Utilisateurs utilisateurs;
	
}
