package com.jh.bankacct.repository.dto;

import java.io.IOException;
import java.sql.SQLException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.jh.bankacct.repository.entity.TradeEntity;

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
public class Trade {

    private Long tradeId;
    private String tradeTypeCode;
    private String tradeName;
    private String signId;
    private String tradeStatusCode;
    private Long companyNo;
    private Long userNo;
    private Long docNo;
    private String docStatus;
    private Long refTradeNo;

    public static Trade of(TradeEntity entity) throws SQLException, IOException {
        return Trade
                    .builder()
                    .tradeId(entity.getTradeId())
                    .tradeTypeCode(entity.getTradeTypeCode())
                    .tradeName(entity.getTradeName())
                    .signId(entity.getSignId())
                    .tradeStatusCode(entity.getTradeStatusCode())
                    .companyNo(entity.getCompanyNo())
                    .userNo(entity.getUserNo())
                    .docNo(entity.getDocNo())
                    .docStatus(entity.getDocStatus())
                    .refTradeNo(entity.getRefTradeNo())
                    .build();
    }

    public TradeEntity toEntity() {
        return TradeEntity
                    .builder()
                    .tradeId(tradeId)
                    .tradeTypeCode(tradeTypeCode)
                    .tradeName(tradeName)
                    .signId(signId)
                    .tradeStatusCode(tradeStatusCode)
                    .companyNo(companyNo)
                    .userNo(userNo)
                    .docNo(docNo)
                    .docStatus(docStatus)
                    .refTradeNo(refTradeNo)
                    .build();
    }

}
