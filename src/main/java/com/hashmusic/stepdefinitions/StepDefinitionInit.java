package com.hashmusic.stepdefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import com.hashmusic.uppermenu.po.UpperMenuPO;
import com.share2people.automation.framework.TestSession;

/**
 * 
 * @author nimit.jain
 *
 */
public class StepDefinitionInit {

	Map<String, Object> options = new HashMap<String, Object>();
	protected static TestSession session;
	static UpperMenuPO Uppermenupo;
	
	public TestSession getTestSession() throws Exception {
		
		options.put("APPIUM_APP_FULL_RESET", true);
		
		if (session == null) {
			
			session = new TestSession(options);
			Uppermenupo = new UpperMenuPO(session);
		
		}

		for (Entry<String, Object> entry : session.config.entrySet()) {
			System.out.println("*********" + entry.getKey() + " " + entry.getValue());
		}
		return session;
	}

}
