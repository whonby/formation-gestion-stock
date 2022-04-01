package com.rg.gestionstock.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="articles")
public class Articles extends AbstractEntity {

	@Column(name="code_article")
	private String codeArticle;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="prix_unitaireht")
	private BigDecimal prixUnitaireHt;
	
	@Column(name="taux_tva")
	private BigDecimal tauxTva;
	
	@Column(name="prix_unitairettc")
	private BigDecimal prixUnitaireTtc;
	
	@Column(name="photo")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	
	
}
