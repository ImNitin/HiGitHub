package com.javabykiran.application.entity;

// default package
// Generated 22 Jun, 2021 9:05:11 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "employee", catalog = "springboot")
public class Employee implements java.io.Serializable {

	private Integer id;
	private String name;
	private String contact;
	private String department;
	private String status;
	private String createddtm;
	private String updateddtm;
	private String createdby;
	private String updatedby;
	private String age;

	public Employee() {
	}

	public Employee(String name, String contact, String department, String status, String createddtm, String updateddtm,
			String createdby, String updatedby, String age) {
		this.name = name;
		this.contact = contact;
		this.department = department;
		this.status = status;
		this.createddtm = createddtm;
		this.updateddtm = updateddtm;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "contact", nullable = false, length = 45)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "department", nullable = false, length = 45)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "status", nullable = false, length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "createddtm", nullable = false, length = 45)
	public String getCreateddtm() {
		return this.createddtm;
	}

	public void setCreateddtm(String createddtm) {
		this.createddtm = createddtm;
	}

	@Column(name = "updateddtm", nullable = false, length = 45)
	public String getUpdateddtm() {
		return this.updateddtm;
	}

	public void setUpdateddtm(String updateddtm) {
		this.updateddtm = updateddtm;
	}

	@Column(name = "createdby", nullable = false, length = 45)
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Column(name = "updatedby", nullable = false, length = 45)
	public String getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	@Column(name = "age", nullable = false, length = 45)
	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}