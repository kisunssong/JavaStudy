package com.abc.model;
// Package ������ ������ �������� com���� ������ abc���� ������ model�̶�� ��Ű��
// ������ ����

public class BoardVO {//VO(Value Object)�� ��� ���ξ�: �������� ���� �ϳ��� ����
//����ó�� ��üȭ �ؼ� ��Ʈ��ũ �� ���� �ڷḦ ������ �� ����ϴ� ������ ����� 
//Ŭ�������� ���̻�� ���� ���ȴ�.. �Ǵٸ� ���̻�� DTO(Data Transfer Object),Bean
//�ᱹ ������ ����� Ŭ���������� BoardVO,BoardDTO,BoardBean�� �߿� �ϳ��� �ַ� ���
	
	private String title; //����
	private String cont; //����
	
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
