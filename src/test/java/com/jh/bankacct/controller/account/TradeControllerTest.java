package com.jh.bankacct.controller.account;

import com.jh.bankacct.controller.AbstractControllerTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class TradeControllerTest extends AbstractControllerTest {

    private MockMvc mockMvc;
    private TradeController tradeController;

    @Autowired
    TradeControllerTest(MockMvc mockMvc, TradeController tradeController) {
        this.mockMvc = mockMvc;
        this.tradeController = tradeController;
    }

    @Override
    protected Object controller() {
        return tradeController;
    }

    @Test
    @DisplayName("GET /trade/list")
    public void tradeControllerGetMappingTest() throws Exception {
        mockMvc.perform(get("/trade/list").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

}
