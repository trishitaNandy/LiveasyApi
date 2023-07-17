package com.spring.loadapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.loadapi.entities.Payload;

public interface LoadDao extends JpaRepository<Payload, Long> {

}
