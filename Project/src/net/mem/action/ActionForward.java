package net.mem.action;

public class ActionForward {
	private boolean isRedirect=false;
	private String path=null;
	
	public boolean getRedirect(){
		return isRedirect;
	}
	
	public String getPath(){
		return path;
	}
	
	public void setRedirect(boolean b){
		isRedirect=b;
	}
	
	public void setPath(String string){
		path=string;
	}
}