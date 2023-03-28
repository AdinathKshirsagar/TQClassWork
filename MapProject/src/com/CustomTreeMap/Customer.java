package com.CustomTreeMap;

public class Customer implements Comparable<Customer>{

	private int custid;
	private String name;
	private long mobileNo;
	
	public Customer()
	{
		
	}
	public Customer(int custid, String name, long mobileNo) {
		super();
		this.custid = custid;
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobile) {
		this.mobileNo = mobile;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", mobileNo=" + mobileNo + "]";
	}
	@Override
	public int compareTo(Customer o) {
		if(this.custid<o.custid)
			return -1;
		else if(this.custid>o.custid)
			return 1;
		else 
			return 0;
	}
	

}
