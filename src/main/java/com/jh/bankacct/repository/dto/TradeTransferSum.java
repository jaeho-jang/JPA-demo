package com.jh.bankacct.repository.dto;

import java.io.IOException;
import java.sql.SQLException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.jh.bankacct.repository.entity.TradeTransferSumEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TradeTransferSum {

    private Long tradeTransferSumId;
    private Trade trade;
    private Long accountNo;
    private String reqDtime;
    private String printContent;
    private Integer totalTranCount;
    private Long totalTranAmt;
    private Long totalTranFee;
    private String transferTodoDay;
    private String transferProcessDay;
    private String memo;
    private char isDeleted;

    public static TradeTransferSum of(TradeTransferSumEntity entity) throws SQLException, IOException {
        // String reqDtime = entity.getReqDtime() != null ? String.valueOf(entity.getReqDtime()) : null;
        // String todoDay = entity.getTransferTodoDay() != null ? entity.getTransferTodoDay().toString() : null;
        // String processDay = entity.getTransferProcessDay() != null ? entity.getTransferProcessDay().toString() : null;
        return TradeTransferSum
                    .builder()
                    .trade(Trade.of(entity.getTrade()))
                    .accountNo(entity.getAccountNo())
                    .reqDtime(entity.getReqDtime())
                    .printContent(entity.getPrintContent())
                    .totalTranCount(entity.getTotalTranCount())
                    .totalTranAmt(entity.getTotalTranAmt())
                    .totalTranFee(entity.getTotalTranFee())
                    .transferTodoDay(entity.getTransferTodoDay())
                    .transferProcessDay(entity.getTransferProcessDay())
                    .memo(entity.getMemo())
                    .isDeleted(entity.getIsDeleted())
                    .build();
    }

    public TradeTransferSumEntity toEntity() {
        return TradeTransferSumEntity
                    .builder()
                    .trade(trade.toEntity())
                    .accountNo(accountNo)
                    .reqDtime(reqDtime)
                    .printContent(printContent)
                    .totalTranCount(totalTranCount)
                    .totalTranAmt(totalTranAmt)
                    .totalTranFee(totalTranFee)
                    .transferTodoDay(transferTodoDay)
                    .transferProcessDay(transferProcessDay)
                    .memo(memo)
                    .isDeleted(isDeleted)
                    .build();
    }

}