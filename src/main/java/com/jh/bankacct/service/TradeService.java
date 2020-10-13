package com.jh.bankacct.service;

import com.jh.bankacct.repository.dao.TradeRepository;
import com.jh.bankacct.repository.entity.TradeTransferSum;

import org.springframework.stereotype.Service;

@Service
public class TradeService {

    private final TradeRepository tradeRepository;

    TradeService(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    public TradeTransferSum getTradeList() {
        TradeTransferSum result = tradeRepository
            .findById(100L)
            .orElseGet(() -> new TradeTransferSum());
        // Blob tradeContents = result.getTrade().getTradeContents();
        // String s = null;
        // try {
        // byte[] allBytesInBlob = tradeContents.getBytes(48, (int)
        // tradeContents.length());
        // s = new String(allBytesInBlob);
        // } catch (SQLException e) {
        // e.printStackTrace();
        // }
        // System.out.println("======" + s + "======");
        return result;
    }

}
