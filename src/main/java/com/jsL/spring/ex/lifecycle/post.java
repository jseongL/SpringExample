package com.jsL.spring.ex.lifecycle;

public class post {
	private String title;
	private String user;
	private String content;
	
	public post(String title, String user, String content){
		this.title = title;
		this.user = user;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "제목 : " + title + "\n사용자: " + user + "\n컨텐츠: " + content;
	}

	public String getTitle() {
		return title;
	}


	public String getUser() {
		return user;
	}


	public String getContent() {
		return content;
	}

	

	


	
	
	
	

}
