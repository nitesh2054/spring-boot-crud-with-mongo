package com.nitesh.practise.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
	@Id
	private String id;
	private String name;
	private String clg;

	public Student() {
		super();
	}

	public Student(String id, String name, String clg) {
		super();
		this.id = id;
		this.name = name;
		this.clg = clg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clg=" + clg + "]";
	}
}
