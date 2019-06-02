package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.bookApi;

@RepositoryRestResource(collectionResourceRel="books",path="books")
public interface bookRepo extends JpaRepository<bookApi,Integer> {

}
