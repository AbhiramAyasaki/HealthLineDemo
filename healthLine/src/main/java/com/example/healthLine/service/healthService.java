package com.example.healthLine.service;

import java.util.List;

import com.example.healthLine.pojo.PersonDO;

public interface healthService {
	
	
	
	PersonDO createPerson(PersonDO personDO);

	PersonDO updateProduct(PersonDO personDO);

	List<PersonDO> getAllpersons();

	PersonDO getProductById(long personId);

	void deletePersons(long id);
	
	
	

}
