/*Create a project in Springboot+hibernate 
Take an entity Product----product_id,pname,pbrand and price.
 * 
 */
package com.LabTest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private String pbrand;
	private double price;
	
}
