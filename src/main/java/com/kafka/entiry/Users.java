package com.kafka.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

	private int userId;
	
	private String firstName;
	
	private String lastName;
}
