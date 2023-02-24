package com.springboot.testkafka.payload;

import java.io.Serializable;

public class CaseSRDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String caseName;
	private String srType;
	private String srNumber;
	private String caseNumber;
	private Long processInstanceId;
	public String getCaseName() {
		return caseName;
	}
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}
	public String getSrType() {
		return srType;
	}
	public void setSrType(String srType) {
		this.srType = srType;
	}
	public String getSrNumber() {
		return srNumber;
	}
	public void setSrNumber(String srNumber) {
		this.srNumber = srNumber;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public Long getProcessInstanceId() {
		return processInstanceId;
	}
	public void setProcessInstanceId(Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}
	public CaseSRDto(String caseName, String srType, String srNumber, String caseNumber, Long processInstanceId) {
		super();
		this.caseName = caseName;
		this.srType = srType;
		this.srNumber = srNumber;
		this.caseNumber = caseNumber;
		this.processInstanceId = processInstanceId;
	}
	
	
}
