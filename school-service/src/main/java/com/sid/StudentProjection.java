package com.sid;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = Student.class)
public interface StudentProjection {

	public String getName();
	public String getEmail();
	
}
