package com.billies_works.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest(classes = EmpApplication.class)
class IndexControllerTest {

    @Autowired
    private MockMvc mockMvc;

	@Test
	void index処理が走って200が返る() throws Exception {
        this.mockMvc.perform( get("/")).andDo(print())
            .andExpect(status().isOk());
	}

}

// 修正時刻: Sun Feb 21 11:42:33 2021
