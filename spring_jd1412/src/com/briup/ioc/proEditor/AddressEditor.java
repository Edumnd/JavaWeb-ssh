package com.briup.ioc.proEditor;

import java.beans.PropertyEditorSupport;
import java.util.StringTokenizer;

import com.briup.bean.Address;

public class AddressEditor extends PropertyEditorSupport{
	public Object value;
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("获取到需要转换的字符串："+text);
//		String[] sArray = text.split(",");
		StringTokenizer str = 
				new StringTokenizer(text,",");
		Address adres = new Address();
		adres.setCountry(str.nextToken());
		adres.setProvince(str.nextToken());
		adres.setCity(str.nextToken());
		value = adres;
	}
	@Override
	public Object getValue() {
		return value;
	}
}
