package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Author;

@Repository
public interface AuthorDAO extends CrudRepository<Author, Integer>{

}
