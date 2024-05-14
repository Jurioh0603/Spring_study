package com.mycom.app2.vo;

import java.util.ArrayList;

public class MemberVO {

	//form의 name 속성 값과 정확하게 일치하는 필드명을 작성
	private String id;
	private String pwd;
	private String name;
	private String age;
	private ArrayList<String> hobby;
	
	public MemberVO() {}
	
	public MemberVO(String id, String pwd, String name, String age, ArrayList<String> hobby) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.hobby = hobby; //다중데이터
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

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

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", hobby=" + hobby + "]";
	}

	
}
