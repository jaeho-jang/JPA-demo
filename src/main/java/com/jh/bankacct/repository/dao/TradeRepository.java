package com.jh.bankacct.repository.dao;

import java.util.List;
import java.util.Optional;

import com.jh.bankacct.repository.entity.TradeTransferSum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends JpaRepository<TradeTransferSum, Long> {

    Optional<TradeTransferSum> findById(Long id);

    List<TradeTransferSum> findAll();

}