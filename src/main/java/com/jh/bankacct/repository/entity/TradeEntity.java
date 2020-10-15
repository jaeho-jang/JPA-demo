package com.jh.bankacct.repository.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_trade")
@NoArgsConstructor @AllArgsConstructor
@Getter
@Builder
public class TradeEntity extends BaseTimeEntity {

    @Id
    // @GeneratedValue
    @Column(name = "trade_no", length = 20)
    private Long tradeId;

    @Column(name = "trade_type_code", length = 6, nullable = false)
    private String tradeTypeCode;

    @Column(name = "trade_name", length = 100)
    private String tradeName;

    @Column(name = "sign_id", length = 50)
    private String signId;

    @Column(name = "trade_status_code", length = 6)
    private String tradeStatusCode;

    @Lob
    @Column(name = "trade_contents", columnDefinition = "blob", nullable = false)
    private Blob tradeContents;

    @Column(name = "company_no", length = 20)
    private Long companyNo;

    @Column(name = "user_no", length = 20)
    private Long userNo;

    @Column(name = "doc_no", length = 20)
    private Long docNo;

    @Column(name = "doc_status", length = 6)
    private String docStatus;

    @Column(name = "ref_trade_no", length = 20)
    private Long refTradeNo;

}
