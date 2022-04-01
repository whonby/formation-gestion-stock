package com.rg.gestionstock.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresses  {

	@Column(name="adresse1")
	private String adresse1;
	
	@Column(name="adresse2")
	private String adresse2;

	@Column(name="ville")
	private String ville;
	
	@Column(name="code_postale")
	private String codePostale;
	
	@Column(name="pays")
	private String pays;
}
