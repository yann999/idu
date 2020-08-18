package com.yan.idu.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "idu_role")
public class IDURole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8467489416824613620L;

	@javax.persistence.Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String rolename;
}
