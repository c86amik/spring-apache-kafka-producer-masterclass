/**
 * 
 */
package com.springcavaj.kafka.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author springcavaj
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class UserModel {
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobileNo;
	private String email;
	private String panNo;
}
