package com.springboot.testkafka.payload;

import java.io.Serializable;

public class UserData implements Serializable {
	
	private UserJbpm data;

	public UserJbpm getData() {
		return data;
	}

	public void setData(UserJbpm data) {
		this.data = data;
	}

	public UserData(UserJbpm data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "UserData [data=" + data + "]";
	}
	public UserData() {
		
	}

}
