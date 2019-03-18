package com.aufa.javaclass;

import org.springframework.stereotype.Component;

public class NasiGoreng implements GoFood {

	
	@Override
	public String getFood() {
		return "Nasi Goreng tanpa saus tomat!";
	}

}
