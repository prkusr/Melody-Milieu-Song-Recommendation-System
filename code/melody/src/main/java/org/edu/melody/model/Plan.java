package org.edu.melody.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.edu.melody.model.Customer.CustomerBuilder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Plan {

	
	private int id;
	private int durationInDays;
	private float cost;
	
	
	public void modifyPlan(){
		// TODO : The code to update the payment
	}
	
	public void deletePlan(Plan plan) {
		// TODO : The code to update the payment
	}
	
	public void  createPlan(int id, int duration, float cost){
		// TODO : The code to update the payment
	}
	
}