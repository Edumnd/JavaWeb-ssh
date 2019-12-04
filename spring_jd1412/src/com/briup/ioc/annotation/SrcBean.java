package com.briup.ioc.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("src")
public class SrcBean {
	
	@Value("100")
	private long id;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return id+"";
	}
}
