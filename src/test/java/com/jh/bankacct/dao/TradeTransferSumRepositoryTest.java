package com.jh.bankacct.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jh.bankacct.repository.dao.TradeTransferSumRepository;
import com.jh.bankacct.repository.entity.TradeTransferSumEntity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
public class TradeTransferSumRepositoryTest {
    
    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private TradeTransferSumRepository tradeTransferSumRepository;

    @Test
    @DisplayName("TradeTransferSum insert test")
    public void insertTest() {
        // given
        TradeTransferSumEntity tradeTransferSum = TradeTransferSumEntity.builder().
            accountNo(1L).
            reqDtime("20210416").
            printContent("1111").
            totalTranCount(10).
            totalTranAmt(10000L).
            totalTranFee(1000L).
            transferTodoDay("20210417").
            transferProcessDay("20210417").
            memo("memo").
            isDeleted('F').
            build();
        // when
        tradeTransferSumRepository.save(tradeTransferSum);
        
        // then
        assertEquals(tradeTransferSum.getTradeTransferSumId(), testEntityManager.find(TradeTransferSumEntity.class, tradeTransferSum.getTradeTransferSumId()).getTradeTransferSumId());
    }

}
