package com.aufa.ioc;

import org.springframework.stereotype.Component;

@Component("abangNasgor")
public class NasiGoreng implements GoFood {

	
	@Override
	public String getFood() {
		return "Nasi Goreng tanpa saus tomat!";
	}

}
