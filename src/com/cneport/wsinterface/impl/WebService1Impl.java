package com.cneport.wsinterface.impl;

import com.cneport.wsinterface.WebService1;

public class WebService1Impl implements WebService1 {

	@Override
	public void wsmethod() {
		System.out.println("ws invoke success");
	}

}
