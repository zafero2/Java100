package com.turkcell.OBS.service.requests.create;

import javax.validation.constraints.NotNull;

import com.turkcell.OBS.model.Teacher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTeacherRequest {


	@NotNull
	private String teacherName;
	

	@NotNull
	private boolean isGicik;
	
	public Teacher toTeacher() {
		Teacher teacher=new Teacher();
		teacher.setTeacherName(this.teacherName);
		teacher.setGicik(this.isGicik);
		return teacher;
	}
}
