package d.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept implements Serializable {

	private Integer did;
	private String dname;
	private String address;

	public Dept() {
	}

	public Dept(Integer did, String dname, String address) {
		super();
		this.did = did;
		this.dname = dname;
		this.address = address;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", address=" + address + "]";
	}

}
