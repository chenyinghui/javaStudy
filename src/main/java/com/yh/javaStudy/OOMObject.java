package com.yh.javaStudy;

import java.util.ArrayList;

public class OOMObject {

	private static byte[] placeHolder = new byte[1024 * 1024];
	
	public static void fillHeap(int num) throws Exception{
		ArrayList<OOMObject> list = new ArrayList<OOMObject>();
		for(int i = 0; i < num; i ++){
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}
	
	public static void main(String[] args) throws Exception {
		fillHeap(1000);
	}
	
}
