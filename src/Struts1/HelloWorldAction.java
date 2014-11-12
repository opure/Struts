package Struts1;

public class HelloWorldAction {
private String msg;
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMsg(){
	return msg;
}
public String excute(){
	this.name="liming";
	msg="ÄãÊÇÎÒµÄÑÛ";
	return "sucess";
}
}
