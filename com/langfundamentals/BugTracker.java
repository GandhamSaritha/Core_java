package com.langfundamentals;

public class BugTracker {
	int bugid;
	String  applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;

	public static void main(String[] args) {
		BugTracker s=new BugTracker();
		s.getbugid(1024);
		s.getapplicationName("Mobile Banking App");
		s.getbugTitle("Login button becomes unclickable after one failed attempt");
		s.getseverity("High");
		s.getpriority("P1 - Urgent");
		s.getstatus("In Progress");
		s.getassignedDeveloper("Sarah Jenkins");

	}
	
	int getbugid(int bid) {
		System.out.println("bugid:" + bid);
		return bugid;
	}
	
	String getapplicationName(String aname) {
		System.out.println("applicationName:" + aname);
		return applicationName;
	}
	
	String getbugTitle(String btitle) {
		System.out.println("bugTitle:"+btitle);
		return bugTitle;
	}
	
	String getseverity(String severity) {
		System.out.println("severity:"+severity);
		return severity;
	}
	
	String getpriority(String priority) {
		System.out.println("priority:"+priority);
		return priority;
	}
	String getstatus(String status) {
		System.out.println("status:"+status);
		return status;
	}
	
	String getassignedDeveloper(String adeveloper) {
		System.out.println("assignedDeveloper:"+adeveloper);
		return assignedDeveloper;
	}

}
