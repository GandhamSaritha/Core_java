package com.langfundamentals;

public class BugTrackerModel2 {
	
	int bugid;
	String  applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;


	public static void main(String[] args) {
		BugTrackerModel2 t =new BugTrackerModel2();
		System.out.println(t.getbugid());
		System.out.println(t.getapplicationName());
		System.out.println(t.getbugTitle());
		System.out.println(t.getseverity());
		System.out.println(t.getpriority());
		System.out.println(t.getstatus());
		System.out.println(t.getassignedDeveloper());
		

	}
	
	int getbugid() {
		bugid=1025;
		return bugid;
	}
	
	String getapplicationName() {
		applicationName="E-Commerce Platform";
		return applicationName;
	}
	
	String getbugTitle() {
		bugTitle="Checkout process throws 500 Error when applying promo codes";
		return bugTitle;
	}
	
	String getseverity() {
		severity="Critical";
		return severity;
	}
	
	String getpriority() {
		priority="P0 - Blocker";
		return priority;
	}
	String getstatus() {
		status="New";
		return status;
	}
	
	String getassignedDeveloper() {
		assignedDeveloper="Alex Rivera";
		return assignedDeveloper;
	}


}
