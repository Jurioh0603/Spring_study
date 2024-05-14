package com.mycom.board.vo;

public class BoardVO {

	//field(view 페이지에 있는 name의 이름과 일치해야함)
	private int no;
	private String writerName;
	private String title;
	private String content;
	
	//constructor
	public BoardVO() {}
	
	public BoardVO(int no, String writerName, String title, String content) {
		this.no = no;
		this.writerName = writerName;
		this.title = title;
		this.content = content;
	}
	
	//setter&getter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", writerName=" + writerName + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
