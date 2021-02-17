package com.example.demo.repo;


import com.example.demo.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TransactionRepo extends CrudRepository<Transaction, Long> {

}