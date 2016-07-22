package com.shuju;

public class Fanxing<Object> {
	private String str;
	private Object o;
	
	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
	public Object write(Object o){
		
		return o;
	}
	public static void main(String[] args) {
		Fanxing<String> fanxing = new Fanxing();
		String write = (String)fanxing.write("100");
		System.out.println(write);
	}
}
