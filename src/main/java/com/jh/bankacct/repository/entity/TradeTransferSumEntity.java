package com.jh.bankacct.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_trade_transfer_sum")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class TradeTransferSumEntity extends BaseTimeEntity {

    @Id
    // @GeneratedValue
    @Column(name = "sum_no", length = 20)
    private Long tradeTransferSumId;

    @ManyToOne
    @JoinColumn(name = "trade_no", nullable = false)
    private TradeEntity trade;

    @Column(length = 20)
    private Long accountNo;

    @Column(columnDefinition = "char(14)", length = 14)
    private char[] reqDtime;

    @Column(length = 20)
    private String printContent;

    @Column(length = 11)
    private Integer totalTranCount;

    @Column(length = 20, nullable = false)
    private Long totalTranAmt;

    @Column(length = 20, nullable = false)
    private Long totalTranFee;

    @Column(columnDefinition = "char(8)", length = 8)
    private char[] transferTodoDay;

    @Column(columnDefinition = "char(8)", length = 8)
    private char[] transferProcessDay;

    @Column(length = 20)
    private String memo;

    @Column(length = 1, nullable = false)
    private char isDeleted;

}
