package com.yan.idu.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "idu_morale")
public class Entreprise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 373262163964029980L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String raison_sociale;
	private String sigle;
	private String reg_com;
	private String niu;
	
}
