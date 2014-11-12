package Struts1;

public class User {

	public boolean login(String username1,String password){
		boolean b=false;
		if(username1.equals("qq")&&password.equals("qq")){
			b=true;
			return b;
		}
		else{
			b=false;
			return b;
		}
		
	}
	

	}
