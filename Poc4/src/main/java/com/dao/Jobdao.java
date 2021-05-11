package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Job;

@Repository
public interface Jobdao extends JpaRepository<Job, Integer>{

}
