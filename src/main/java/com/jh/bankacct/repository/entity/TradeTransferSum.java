package com.jh.bankacct.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "t_trade_transfer_sum")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class TradeTransferSum {

    @Id
    // @GeneratedValue
    @Column(name = "sum_no", length = 20)
    private Long tradeTransferSumId;

    @ManyToOne
    @JoinColumn(name = "trade_no", nullable = false)
    private Trade trade;

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

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "asia/seoul")
    @Column(name = "insert_timestamp", columnDefinition = "timestamp default current_timestamp", updatable = false, insertable = false, nullable = false)
    private LocalDateTime insertTimeStamp;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "asia/seoul")
    @Column(name = "updated_timestamp")
    private LocalDateTime updatedTimeStamp;

}
