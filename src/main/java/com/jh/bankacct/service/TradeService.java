package com.jh.bankacct.service;

import java.io.IOException;
import java.sql.SQLException;

import com.jh.bankacct.repository.dao.TradeTransferSumRepository;
import com.jh.bankacct.repository.dto.TradeTransferSum;
import com.jh.bankacct.repository.entity.TradeTransferSumEntity;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TradeService {

    private final TradeTransferSumRepository tradeRepository;

    public TradeTransferSum getTradeList() {
        TradeTransferSum result = null;
        try {
			result = TradeTransferSum.of(
			    tradeRepository
			        .findById(100L)
			        .orElseGet(() -> TradeTransferSumEntity.builder().build())
            );
		} catch (SQLException | IOException e) {
            e.printStackTrace();
		}
        return result;
    }

}
