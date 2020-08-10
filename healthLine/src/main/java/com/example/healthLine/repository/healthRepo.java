package com.example.healthLine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.healthLine.pojo.PersonDO;

public interface healthRepo extends JpaRepository<PersonDO, Long> {

}
