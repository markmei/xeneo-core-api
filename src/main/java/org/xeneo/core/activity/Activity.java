package org.xeneo.core.activity;

import java.util.Date;

/**
 * This class represents an Activity.
 * <p>
 * The activity construct represents an action undertaken by an performer/actor/user on or with a certain object. Additionally also a target object can be involved.
 * <p>
 * Thus, the constitutive parts of an activity are:
 * <ul>
 * <li>User {@link #getUserURI()}</li>
 * <li>Creation date {@link #getCreationDate()}</li>
 * <li>Action {@link #getActionURI()}</li>
 * <li>Object {@link #getObjectURI()}</li>
 * <li>Target {@link #getTargetURI()}</li>
 * </ul>
 * 
 * @author Stefan Huber
 */
public class Activity {
	
    /*
     * This URI represents the unique identifier of this Activity.
     */
	private String activityURI;
	
	private Date creationDate;
	
	private String actorURI;
	private String actionURI;
	
	private Object object;
	private Object target;
	
	private String summary;
	private String content;
	public String getActivityURI() {
		return activityURI;
	}
	public void setActivityURI(String activityURI) {
		this.activityURI = activityURI;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getActorURI() {
		return actorURI;
	}
	public void setActorURI(String actorURI) {
		this.actorURI = actorURI;
	}
	public String getActionURI() {
		return actionURI;
	}
	public void setActionURI(String actionURI) {
		this.actionURI = actionURI;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	/*
	 * TODO: add activity provider functionality. Activity Type might be necessary, to specify the display settings... (Each type has a different display)
	 */
	
}
