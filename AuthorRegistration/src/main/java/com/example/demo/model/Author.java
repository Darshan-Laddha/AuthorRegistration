package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
    private Integer id;
    private String title;
    private String category;
    private String name;
    
    
	public Author() {
		super();
	}
	public Author(int id, String title, String category, String authorId, String name) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.name = name;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}