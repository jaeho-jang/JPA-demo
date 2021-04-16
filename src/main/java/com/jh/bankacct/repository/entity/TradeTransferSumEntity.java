package com.jh.bankacct.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_trade_transfer_sum")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TradeTransferSumEntity extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sum_no", length = 20)
    private Long tradeTransferSumId;

    @ManyToOne
    @JoinColumn(name = "trade_no")
    private TradeEntity trade;

    @Column(length = 20)
    private Long accountNo;

    @Column(columnDefinition = "char(14)", length = 14)
    private String reqDtime;

    @Column(length = 20)
    private String printContent;

    @Column(length = 11)
    private Integer totalTranCount;

    @Column(length = 20, nullable = false)
    private Long totalTranAmt;

    @Column(length = 20, nullable = false)
    private Long totalTranFee;

    @Column(columnDefinition = "char(8)", length = 8)
    private String transferTodoDay;

    @Column(columnDefinition = "char(8)", length = 8)
    private String transferProcessDay;

    @Column(length = 20)
    private String memo;

    @Column(length = 1, nullable = false)
    private char isDeleted;

    @Builder
    public TradeTransferSumEntity(TradeEntity trade, Long accountNo, String reqDtime,
            String printContent, Integer totalTranCount, Long totalTranAmt, Long totalTranFee, String transferTodoDay,
            String transferProcessDay, String memo, char isDeleted) {
        this.trade = trade;
        this.accountNo = accountNo;
        this.reqDtime = reqDtime;
        this.printContent = printContent;
        this.totalTranCount = totalTranCount;
        this.totalTranAmt = totalTranAmt;
        this.totalTranFee = totalTranFee;
        this.transferTodoDay = transferTodoDay;
        this.transferProcessDay = transferProcessDay;
        this.memo = memo;
        this.isDeleted = isDeleted;
    }

}
