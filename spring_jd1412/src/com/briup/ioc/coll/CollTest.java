package com.briup.ioc.coll;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollTest {
	public static String str = "static_FIled";
	private String[] arrys;
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	private Properties props;
	public String[] getArrys() {
		return arrys;
	}
	public void setArrys(String[] arrys) {
		this.arrys = arrys;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
}
