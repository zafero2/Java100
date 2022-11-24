package com.turkcell.OBS.service.requests.create;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateStudentRequest {

	@NotNull
	private String studentName;
	@NotNull
	private long studentNumber;
	@NotNull
	private int studentYear;

}
