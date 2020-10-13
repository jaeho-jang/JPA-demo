package com.jh.bankacct.controller.account;

import com.jh.bankacct.repository.entity.TradeTransferSum;
import com.jh.bankacct.service.TradeService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "0.0.0.0", maxAge = 3600)
@RequestMapping("/trade")
public class TradeController {

    private final TradeService tradeService;

    TradeController(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<?> getTradeList() {
        TradeTransferSum trades = tradeService.getTradeList();
        return ResponseEntity.ok(trades);
    }

}
