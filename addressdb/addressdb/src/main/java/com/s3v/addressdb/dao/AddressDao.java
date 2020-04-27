package com.s3v.addressdb.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.s3v.addressdb.entity.PersonEntity;

@Repository
public interface AddressDao extends CrudRepository<PersonEntity, String> {

	public PersonEntity findByName(String name);

}
