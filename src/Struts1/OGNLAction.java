package Struts1;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class OGNLAction {
	private String  name   ;
	private String  age;
	private String  id ;
	private String  sex ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String excute() throws Exception{
		
		HttpServletRequest request=ServletActionContext.getRequest();
	    request.setAttribute("name", getName());
        Map session=ActionContext.getContext().getSession();		
		session.put("name", getName());
		Map application=ActionContext.getContext().getApplication();
		application.put("name", getName());
        return "success";
		
	}

}
