package com.boot.om.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="e_name",length = 50,unique = true)
	@NonNull
	private String ename;
	
	@Column(name="dept",length = 15,nullable = false)
	@NonNull
	private String dept;
	
	@Column(name="sal")
	@NonNull
	private Double sal;
	
}
