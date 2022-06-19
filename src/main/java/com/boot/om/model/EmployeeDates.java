package com.boot.om.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="emp_dates")
@NoArgsConstructor
@RequiredArgsConstructor
public class EmployeeDates {

	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	private String name;
	
	@Temporal(TemporalType.DATE)
	@NonNull
	private Date date1;
	
	@Temporal(TemporalType.TIME)
	@NonNull
	private Date date2;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NonNull
	private Date date3;
	
}
