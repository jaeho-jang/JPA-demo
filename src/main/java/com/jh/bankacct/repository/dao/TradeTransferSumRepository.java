package com.jh.bankacct.repository.dao;

import java.util.List;
import java.util.Optional;

import com.jh.bankacct.repository.entity.TradeTransferSumEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeTransferSumRepository extends JpaRepository<TradeTransferSumEntity, Long> {

    Optional<TradeTransferSumEntity> findById(Long id);

    List<TradeTransferSumEntity> findAll();

}