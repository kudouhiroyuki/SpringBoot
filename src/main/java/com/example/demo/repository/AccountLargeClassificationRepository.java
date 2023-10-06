package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AccountsLargeClassificationsEntity;

@Repository
public interface AccountLargeClassificationRepository extends JpaRepository<AccountsLargeClassificationsEntity,Integer>{
}