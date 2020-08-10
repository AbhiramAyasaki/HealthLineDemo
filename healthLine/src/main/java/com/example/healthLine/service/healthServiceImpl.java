package com.example.healthLine.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthLine.exception.CustomizedException;
import com.example.healthLine.pojo.PersonDO;
import com.example.healthLine.repository.healthRepo;


@Service
@Transactional
public class healthServiceImpl implements healthService {

	@Autowired
	private healthRepo healthRepo;
	
	@Override
	public PersonDO createPerson(PersonDO personDO) {
		return healthRepo.save(personDO);
	}

	@Override
	public PersonDO updateProduct(PersonDO personDO) {
       Optional<PersonDO> productDb = this.healthRepo.findById(personDO.getId());
		
		if(productDb.isPresent()) {
			PersonDO productUpdate = productDb.get();
			productUpdate.setId(personDO.getId());
			productUpdate.setActive(personDO.getActive());
			productUpdate.setPersonName(personDO.getPersonName());
			productUpdate.setPhoneNO(personDO.getPhoneNO());
			productUpdate.setEmail(personDO.getEmail());
			productUpdate.setOrganizations(personDO.getOrganizations());
			
			healthRepo.save(productUpdate);
			return productUpdate;
		}else {
			throw new CustomizedException("Record not found with id : " + personDO.getId());
		}	
	}

	@Override
	public List<PersonDO> getAllpersons() {
		return this.healthRepo.findAll();
	}

	@Override
	public PersonDO getProductById(long personId) {
      Optional<PersonDO> productDb = this.healthRepo.findById(personId);
		if(productDb.isPresent()) {
			return productDb.get();
		}else {
			throw new CustomizedException("Record not found with id : " + personId);
		}
	}

	@Override
	public void deletePersons(long id) {
        Optional<PersonDO> productDb = this.healthRepo.findById(id);
		
		if(productDb.isPresent()) {
			this.healthRepo.delete(productDb.get());
		}else {
			throw new CustomizedException("Record not found with id : " + id);
		}
		
	}

}
