package org.ssh.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private String eid;
	@Column
	private String ename;
	@Column
	private String bdate;
	@Column
	private String sex;
	@Column
	private String did;
	@Column
	private String city;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", bdate=" + bdate + ", sex=" + sex + ", did=" + did + ", city="
				+ city + "]";
	}

}
