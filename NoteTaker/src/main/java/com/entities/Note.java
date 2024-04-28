package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notes")
public class Note {
	@Id
	private int id;

	public Note(String title, String contnt, Date addedDate) {
		super();
		this.id = new Random().nextInt(100000);
		this.title = title;
		this.contnt = contnt;
		this.addedDate = addedDate;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContnt() {
		return contnt;
	}

	public void setContnt(String contnt) {
		this.contnt = contnt;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	private String title;
	@Column(length = 5000)
	private String contnt;
	private Date addedDate;

}
