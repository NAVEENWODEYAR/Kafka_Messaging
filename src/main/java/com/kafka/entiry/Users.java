package com.kafka.entiry;

import java.util.Objects;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
public class Users {

	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	public Users() {}

	public Users(int userId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& userId == other.userId;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
