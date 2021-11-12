package com.yedam.java.ch03;

import java.io.Serializable;
import java.util.Date;


public class Board implements Serializable{
	private int bno;
	private String tite;
	private String content;
	private String writer;
	private Date date;
	
	
	
	public Board(int bno, String tite, String content, String writer, Date date) {
		this.bno = bno;
		this.tite = tite;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTite() {
		return tite;
	}
	public void setTite(String tite) {
		this.tite = tite;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
