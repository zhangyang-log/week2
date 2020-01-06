package com.zhangtao.bean;

public enum Status {

	SUCCESS(0), NOSUCCESS(1), NOKNOW(1);
	private Integer num;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	private Status(Integer num) {
		this.num = num;
	}

}
