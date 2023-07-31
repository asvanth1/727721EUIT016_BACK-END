package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Feedmodel;

public interface FeedRepo extends JpaRepository<Feedmodel,Integer>{

}