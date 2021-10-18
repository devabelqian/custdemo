package com.example.demo.orm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.orm.domain.CutomerDomain;

public interface CutomerDao extends JpaRepository<CutomerDomain, Long> {

}
