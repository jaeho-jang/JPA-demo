package com.jh.bankacct.repository.dao;

import com.jh.bankacct.repository.dto.Trade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
    
}
