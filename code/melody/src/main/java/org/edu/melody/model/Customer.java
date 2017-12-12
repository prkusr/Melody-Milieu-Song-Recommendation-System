package org.edu.melody.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Customer extends User {
	private Playlist playlist;
	private List<Song> userHistory;
	private Plan plan;
	private Date planEnrollmentDate;
	private List<Song> recommendations;
	private List<Song> purchase;
	private String test;
	
	@Builder
	public Customer(long userId, String email, boolean isActive){
		this.email = email;
		this.isActive = isActive;
		this.userId = userId;
	}
	
	public void addPlaylist(Playlist playlist) {
		
	}
	
	public void updatePlaylist(Playlist playlist) {
		// TODO : The code to update the payment
	}
	
	public void deletePlaylist(Playlist playlist) {
		// TODO : The code to update the payment
	}
	
	public void changePlan(Plan plan) {
		// TODO : The code to update the payment
	}

	public void updatePlayHistory() {
		// TODO : The code to update the payment
	}

	public void insertCreditCardDetails() {
		// TODO : The code to update the payment
	}
	
	public void updateRecommendations() {
		// TODO : The code to update the payment
	}

	public void sharePlaylist(Playlist playlist) {
		// TODO : The code to update the payment
	}
	
	public void buySong(Song song) {
		// TODO : The code to update the payment
	}
	@Override
	public String toString() {
		String planStr = ((plan == null) ? "Not enrolled in any plan.":(", Plan: ["+plan.toString()+"], Plan enrollment Date ["+planEnrollmentDate.toString()+"]"));
		return new StringBuilder("User {").append(" ["+userName+"]")
											.append(", cellNo: ["+String.valueOf(cellNumber)+"]")
											.append(", email: ["+email+"]")
											.append(", Plan: ["+planStr+"] }").toString();
	}
}
