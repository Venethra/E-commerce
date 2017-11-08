package com.model;

import java.io.Serializable;



import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name="Category Product")
public class Category implements Serializable {

	public static final long serialVersionUID=1L;
	@Id
	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	@OnetoMany
	private Set
}
