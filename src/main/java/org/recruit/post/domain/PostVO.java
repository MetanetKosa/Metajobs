package org.recruit.post.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class PostVO {
	private int postNo;
	private String postTitle;
	private String postJob;
	private String postCareer;
	private String postEmptype;
	private String postAdd;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date postSdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date postFdate;
	private String postSal;
	private String postEdu;
	private String postAge;
	private String postHow;
	private String postUrl;
	private int comCno;
	private int memNo;
}
