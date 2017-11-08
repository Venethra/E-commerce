package com.model;

import java.io.Serializable;



import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name="Product ")
public class Product implements Serializable {

	public static final long serialVersionUID=1L;
	@Id
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}