package com.s3v.addressdb.addressFinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/addressBook")
public interface AddressBook {

	@GetMapping("/address/{name}")
	public String getAddress(@PathVariable("name") String name);

}
