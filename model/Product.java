package com.sinq.nystore.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@Document(collection = "Product")
public class Product {
	
	@Id 
	private int id;
	private String productName;
	private String productDescription;
	private String productCategory;
	
}
