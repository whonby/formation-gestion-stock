package com.rg.gestionstock.models;

import javax.persistence.*;

import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="mvt_stk")
public class MvtStk extends AbstractEntity{

	@Column(name = "datemvt")
	private Instant dateMvt;

	@Column(name = "quantite")
	private BigDecimal quantite;

	@ManyToOne
	@JoinColumn(name="article_id")
	private Articles articles;

	@Column(name="typmvt")
	private TypeMvtStk typeMvtStk;

}
