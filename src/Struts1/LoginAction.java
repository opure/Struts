package Struts1;

public class LoginAction {
	private String username1;
	private String password;
	public String getUsername() {
		return username1;
	}
	public void setUsername(String username) {
		this.username1 = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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

	public String excute() throws Exception{

		if(login(username1, password)){
			return "success";
			
		}else{
		return "error";
		}
	}


}
