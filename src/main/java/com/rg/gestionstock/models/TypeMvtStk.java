package com.rg.gestionstock.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="type_mvt_stk")
public class TypeMvtStk extends AbstractEntity {

    private String nom;
}
