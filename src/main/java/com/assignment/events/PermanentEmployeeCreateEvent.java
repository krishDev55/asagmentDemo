package com.assignment.events;

import org.springframework.context.ApplicationEvent;

import com.assignment.model.PermanentEmployee;

public class PermanentEmployeeCreateEvent  extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PermanentEmployee emp;
	public PermanentEmployeeCreateEvent(PermanentEmployee emp) {
		super(emp);
		this.emp=emp;
	}

}
