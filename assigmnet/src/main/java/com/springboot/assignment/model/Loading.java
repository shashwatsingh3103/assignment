package com.springboot.assignment.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Loading {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private float weight;
	private String comment;
	
	private LocalDate date;
	private String shipperId;
	
	
	
	
}
