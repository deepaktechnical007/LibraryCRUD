package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	private int id;
	private String title;
	private String author;
	private int quantity;
	private float price;
	private String comments;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Book(int id, String title, String author, int quantity, float price, String comments) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.price = price;
		this.comments = comments;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	

}
