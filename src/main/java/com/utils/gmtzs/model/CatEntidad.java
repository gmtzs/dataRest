package com.utils.gmtzs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "CAT_ENTIDADES")
@Getter
@Setter
public class CatEntidad {
	
	
	@Id
	@Column(name = "ID_ENTIDADES")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idEntidad" )
	@SequenceGenerator(name = "idEntidad", sequenceName = "sec_entidades",allocationSize = 1 )
	private Integer idEntidad;
	
	@Column(name = "ENTIDAD")
	private String entidad;

	@Column(name = "DESCRIPCION")
	private String descripcion;

}
