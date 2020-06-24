package com.poobesh.models;

public abstract class Person {
	
	protected long id;
	protected String name;
	protected String fatherName;
	protected long phoneNo;
	protected String address;
	protected long pincode;
    protected long amount;  // considered as salary and Fees 
	
	
	
	public Person() {
		super();
	}
	public Person(long id, String name, String fatherName, long phoneNo, String address, long pincode) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.pincode = pincode;
	}
	
	public abstract long getAmount();
	public abstract void setAmount(long amount);
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		if (this.hashCode() == obj.hashCode())
			return true;
		
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		return true;
	}
	
	
}
