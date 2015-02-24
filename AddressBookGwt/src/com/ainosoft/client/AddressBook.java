package com.ainosoft.client;

import java.util.ArrayList;

public class AddressBook {

	private String name;
	private String address;
	private String number;
	private ArrayList<AddressBook> addressList;
	
	public AddressBook(String name,String address,String number){
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	
	public void addAddresstoList(AddressBook addressObj){
		addressList.add(addressObj);
		System.out.println(addressList.get(0).getName()+""+addressList.get(0).getAddress()+""+addressList.get(0).getNumber());
	}	
}
