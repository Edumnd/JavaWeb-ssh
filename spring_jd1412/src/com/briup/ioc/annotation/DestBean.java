package com.briup.ioc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("destBean")
//@Scope("prototype")
public class DestBean {
	
//	@Autowired
//	@Qualifier("srcBean")
//	@Resource
	private	SrcBean src;

	public DestBean(){
		System.out.println("DestBean....");
	}
//	@Autowired
	public DestBean(/*@Qualifier("src")*/SrcBean srcBean1){
		this.src = srcBean1;
	}
	
	public SrcBean getSrcBean() {
		return src;
	}

//	@Autowired(required=false)
	@Resource(name="src")
	public void setSrcBean(/*@Qualifier("src")*/SrcBean srcBean1) {
		this.src = srcBean1;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("dest init ....");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("dest destory....");
	}
}
