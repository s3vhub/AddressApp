package com.s3v.addressdb.addressFinderImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.s3v.addressdb.addressFinder.AddressBook;
import com.s3v.addressdb.dao.AddressDao;

@RestController
public class AddressBookImpl implements AddressBook {

	@Autowired
	private AddressDao addressDao;

	@Override
	public String getAddress(String name) {
		return addressDao.findByName(name).getAddress();
	}

}
