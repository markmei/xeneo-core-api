/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xeneo.core.plugin.activity;

import org.xeneo.core.activity.ActivityManager;
import org.xeneo.core.plugin.Plugin;

/**
 *
 * @author Stefan Huber
 */
public interface ActivityPlugin extends Plugin, Runnable {   
    
    public void setActivityManager(ActivityManager am);
    
}
