package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class bookApi {
	@Override
	public String toString() {
		return "bookApi [Id=" + Id + ", Book_Name=" + Book_Name + ", Author=" + Author + ", Genere=" + Genere
				+ ", Price=" + Price + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBook_Name() {
		return Book_Name;
	}
	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String genere) {
		Genere = genere;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	@Id
	@GeneratedValue
	private int Id;
	private  String Book_Name;
	private String Author;
	private String Genere;
	private  float Price;
}
