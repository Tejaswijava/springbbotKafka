package com.springboot.testkafka.payload;

import java.io.Serializable;

public class CaseSRDataDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CaseSRDto data;

	public CaseSRDto getData() {
		return data;
	}

	public void setData(CaseSRDto data) {
		this.data = data;
	}
	
}
