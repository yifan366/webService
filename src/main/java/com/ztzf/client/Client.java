package com.ztzf.client;

public class Client {

	public static void main(String[] args) {
		 Function fu =new FunctionService().getFunctionPort();  
		    String str=fu.transWords("Let's Get Heck Out Of Here!");  
		    
		    System.out.println(str);
	}
	
	
}
