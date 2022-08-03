package com.tzn.tusk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Code {

	@Id
	private int cid;
	private String cname;
	private String description;
	private String code;
	private String output;
	private String logic;
	private String video;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getLogic() {
		return logic;
	}
	public void setLogic(String logic) {
		this.logic = logic;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
	@Override
	public String toString() {
		return "Code [cid=" + cid + ", cname=" + cname + ", description=" + description + ", code=" + code + ", output="
				+ output + ", logic=" + logic + ", video=" + video + "]";
	}
	
}
