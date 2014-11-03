package de.is24.rest.api.export.api.parser.impl;

/**
 * 
 * @author Martin Fluegge
 * 
 */
public class ProjectNotFoundException extends IS24ApiException {

	private String projectId;
	private static final long serialVersionUID = 1L;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public ProjectNotFoundException(String projectId) {
		this.projectId = projectId;
	}
}