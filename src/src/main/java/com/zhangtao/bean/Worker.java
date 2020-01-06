package com.zhangtao.bean;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Worker {

	private Integer wid;
	private String wname;// 关键字
	private String whear;// 描述
	private String workname;
	private String produces;
	private String addr;
	private Integer money;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date wtime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date ntime;
	private String ntype;
	private String xiangqing;

	public Integer getWid() {
		return wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public String getWhear() {
		return whear;
	}

	public void setWhear(String whear) {
		this.whear = whear;
	}

	public String getWorkname() {
		return workname;
	}

	public void setWorkname(String workname) {
		this.workname = workname;
	}

	public String getProduces() {
		return produces;
	}

	public void setProduces(String produces) {
		this.produces = produces;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Date getWtime() {
		return wtime;
	}

	public void setWtime(Date wtime) {
		this.wtime = wtime;
	}

	public Date getNtime() {
		return ntime;
	}

	public void setNtime(Date ntime) {
		this.ntime = ntime;
	}

	public String getNtype() {
		return ntype;
	}

	public void setNtype(String ntype) {
		this.ntype = ntype;
	}

	public String getXiangqing() {
		return xiangqing;
	}

	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}

	public Worker(Integer wid, String wname, String whear, String workname, String produces, String addr, Integer money,
			Date wtime, Date ntime, String ntype, String xiangqing) {
		super();
		this.wid = wid;
		this.wname = wname;
		this.whear = whear;
		this.workname = workname;
		this.produces = produces;
		this.addr = addr;
		this.money = money;
		this.wtime = wtime;
		this.ntime = ntime;
		this.ntype = ntype;
		this.xiangqing = xiangqing;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

}
