package com.yan.idu.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

@Entity(name = "idu_user")
public class IDUUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8780443584216178087L;

	@javax.persistence.Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String username;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<IDURole> roles = new HashSet<>();
}
