package com.abc.model;
// Package 예약어로 도메인 역순으로 com폴더 하위에 abc폴더 하위에 model이라는 패키지
// 폴더를 생성

public class BoardVO {//VO(Value Object)의 약어 접두어: 여러개의 값을 하나의 압축
//파일처럼 객체화 해서 네트워크 간 빠른 자료를 전송할 때 사용하는 데이터 저장빈 
//클래스명의 접미사로 많이 사용된다.. 또다른 접미사로 DTO(Data Transfer Object),Bean
//결국 데이터 저장빈 클래스명으로 BoardVO,BoardDTO,BoardBean등 중에 하나를 주로 사용
	
	private String title; //제목
	private String cont; //내용
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setCont(String cont) {
		this.cont=cont;
	}
	public String getCont() {
		return cont;
	}
	
	
	
}
