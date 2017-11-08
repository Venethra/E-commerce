package com.model;

import java.io.Serializable;



import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name="Supplier Product")
public class Supplier implements Serializable {

	public static final long serialVersionUID=1L;
	@Id
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
