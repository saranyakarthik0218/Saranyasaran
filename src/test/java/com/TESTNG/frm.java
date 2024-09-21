package com.TESTNG;

public class frm {

	private frm () {
	}
		
		private static frm fr;
		public static frm getIinstancerm() {
	
		if(fr==null) {
			fr=new frm();
		}
		return fr;
		}
}

