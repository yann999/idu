package com.yan.idu.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "idu_physique")
public class Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4528903764164983723L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String nom;
	private String prenom;
	private String cni;
	private String niu;
	
	
}
