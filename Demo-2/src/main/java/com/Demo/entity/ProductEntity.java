package com.Demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="product_entity")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name1")
	private String name1;
	@Column(name = "grade")
	private String grade;
//	public ProductEntity(Long id, String name1, String grade) {
//		super();
//		this.id = id;
//		this.name1 = name1;
//		this.grade = grade;
//	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name1=" + name1 + ", grade=" + grade + "]";
	}
	

}
