package com.blz.example.model;

import com.blz.example.dto.AddressBookDTO;
import lombok.Data;

@Data
public class AddressBookData {

	private int addressBookId;
	private String name;
	private String address;

	public AddressBookData(int addressBookId, AddressBookDTO addressBookDTO) {
		super();
		this.addressBookId = addressBookId;
		this.name = addressBookDTO.name;
		this.address = addressBookDTO.address;
	}
}
