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
@NoArgsConstructor @AllArgsConstructor
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

    @Column(name = "account_no", length = 20)
    private Long accountNo;

    @Column(name = "req_dtime", columnDefinition = "char(14)", length = 14)
    private char[] reqDtime;

    @Column(name = "print_content", length = 20)
    private String printContent;

    @Column(name = "total_tran_count", length = 11)
    private Integer totalTranCount;

    @Column(name = "total_tran_amt", length = 20, nullable = false)
    private Long totalTranAmt;

    @Column(name = "total_tran_fee", length = 20, nullable = false)
    private Long totalTranFee;

    @Column(name = "transfer_todo_day", columnDefinition = "char(8)", length = 8)
    private char[] transferTodoDay;

    @Column(name = "transfer_process_day", columnDefinition = "char(8)", length = 8)
    private char[] transferProcessDay;

    @Column(name = "memo", length = 20)
    private String memo;

    @Column(name = "is_deleted", length = 1, nullable = false)
    private char isDeleted;

}
