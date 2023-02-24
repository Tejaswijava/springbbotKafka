package com.springboot.testkafka.payload;

import java.util.HashMap;
import java.util.Map;

public class Case {
	

		
		
	    private Map<String, Object> caseData;
	    private Map<String, String> caseUserAssignments;
	    private Map<String, Object> caseGroupAssignments;
	    private Map<String, Object> caseDataRestrictions;

	    public Case() {
	        caseData = new HashMap<>();
	        caseUserAssignments = new HashMap<>();
	        caseGroupAssignments = new HashMap<>();
	        caseDataRestrictions = new HashMap<>();
	    }

	    public Map<String, Object> getCaseData() {
	        return caseData;
	    }

	    public void setCaseData(Map<String, Object> caseData) {
	        this.caseData = caseData;
	    }

	    public Map<String, String> getCaseUserAssignments() {
	        return caseUserAssignments;
	    }

	    public void setCaseUserAssignments(Map<String, String> caseUserAssignments) {
	        this.caseUserAssignments = caseUserAssignments;
	    }

	    public Map<String, Object> getCaseGroupAssignments() {
	        return caseGroupAssignments;
	    }

	    public void setCaseGroupAssignments(Map<String, Object> caseGroupAssignments) {
	        this.caseGroupAssignments = caseGroupAssignments;
	    }

	    public Map<String, Object> getCaseDataRestrictions() {
	        return caseDataRestrictions;
	    }

	    public void setCaseDataRestrictions(Map<String, Object> caseDataRestrictions) {
	        this.caseDataRestrictions = caseDataRestrictions;
	    }

		@Override
		public String toString() {
			return "Case [caseData=" + caseData + ", caseUserAssignments=" + caseUserAssignments
					+ ", caseGroupAssignments=" + caseGroupAssignments + ", caseDataRestrictions="
					+ caseDataRestrictions + "]";
		}
	

	
}

