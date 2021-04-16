package com.jh.bankacct.repository.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_trade")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TradeEntity extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trade_no", length = 20)
    private Long tradeId;

    @Column(length = 6, nullable = false)
    private String tradeTypeCode;

    @Column(length = 100)
    private String tradeName;

    @Column(length = 50)
    private String signId;

    @Column(length = 6)
    private String tradeStatusCode;

    @Lob
    @Column(columnDefinition = "blob", nullable = false)
    private Blob tradeContents;

    @Column(length = 20)
    private Long companyNo;

    @Column(length = 20)
    private Long userNo;

    @Column(length = 20)
    private Long docNo;

    @Column(length = 6)
    private String docStatus;

    @Column(length = 20)
    private Long refTradeNo;

    @Builder
    public TradeEntity(String tradeTypeCode, String tradeName, String signId, String tradeStatusCode,
            Blob tradeContents, Long companyNo, Long userNo, Long docNo, String docStatus, Long refTradeNo) {
        this.tradeTypeCode = tradeTypeCode;
        this.tradeName = tradeName;
        this.signId = signId;
        this.tradeStatusCode = tradeStatusCode;
        this.tradeContents = tradeContents;
        this.companyNo = companyNo;
        this.userNo = userNo;
        this.docNo = docNo;
        this.docStatus = docStatus;
        this.refTradeNo = refTradeNo;
    }

}
