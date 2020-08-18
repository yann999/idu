package com.yan.idu.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "idu_site")
public class Site implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2877611650510239906L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
}
