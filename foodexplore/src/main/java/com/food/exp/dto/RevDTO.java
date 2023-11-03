package com.food.exp.dto;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("RevDTO")
public class RevDTO {
	int rev_no;
	String user_email;
	String rst_id;
	int rev_star;
	String rev_comment;
	Date rev_date;
	String rev_title;
	String rst_name;
	String keyword;
	Double rev_star_avg;
	List<FileDTO> attachList;
	
	public RevDTO() {}

	public RevDTO(int rev_no, String user_email, String rst_id, int rev_star, String rev_comment, Date rev_date,
			String rev_title, String rst_name, String keyword, List<FileDTO> attachList) {
		super();
		this.rev_no = rev_no;
		this.user_email = user_email;
		this.rst_id = rst_id;
		this.rev_star = rev_star;
		this.rev_comment = rev_comment;
		this.rev_date = rev_date;
		this.rev_title = rev_title;
		this.rst_name = rst_name;
		this.keyword = keyword;
		this.rev_star_avg = rev_star_avg;
		this.attachList = attachList;
	}

	public int getRev_no() {
		return rev_no;
	}

	public void setRev_no(int rev_no) {
		this.rev_no = rev_no;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getRst_id() {
		return rst_id;
	}

	public void setRst_id(String rst_id) {
		this.rst_id = rst_id;
	}

	public int getRev_star() {
		return rev_star;
	}

	public void setRev_star(int rev_star) {
		this.rev_star = rev_star;
	}

	public String getRev_comment() {
		return rev_comment;
	}

	public void setRev_comment(String rev_comment) {
		this.rev_comment = rev_comment;
	}

	public Date getRev_date() {
		return rev_date;
	}

	public void setRev_date(Date rev_date) {
		this.rev_date = rev_date;
	}

	public String getRev_title() {
		return rev_title;
	}

	public void setRev_title(String rev_title) {
		this.rev_title = rev_title;
	}

	public String getRst_name() {
		return rst_name;
	}

	public void setRst_name(String rst_name) {
		this.rst_name = rst_name;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
		
	public Double getRev_star_avg() {
		return rev_star_avg;
	}

	public void setRev_star_avg(Double rev_star_avg) {
		this.rev_star_avg = rev_star_avg;
	}

	public List<FileDTO> getAttachList() {
		return attachList;
	}

	public void setAttachList(List<FileDTO> attachList) {
		this.attachList = attachList;
	}

	@Override
	public String toString() {
		return "RevDTO [rev_no=" + rev_no + ", user_email=" + user_email + ", rst_id=" + rst_id + ", rev_star="
				+ rev_star + ", rev_comment=" + rev_comment + ", rev_date=" + rev_date + ", rev_title=" + rev_title
				+ ", rst_name=" + rst_name + ", keyword=" + keyword + ", attachList=" + attachList + "]";
	}

}
