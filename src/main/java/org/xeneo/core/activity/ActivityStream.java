package org.xeneo.core.activity;

import java.util.List;

/*
 * @author Stefan Huber
 */

public interface ActivityStream {

	public List<Activity> getActivities(String caseURI, String taskURI, int limit);
	
	public List<Activity> getActivities(String caseURI, int limit);
	
	public List<Activity> getActivities(Filter filter);
	
}
