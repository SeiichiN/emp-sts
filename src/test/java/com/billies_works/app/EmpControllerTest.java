package com.billies_works.app;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.billies_works.app.entity.Emp;
import com.billies_works.app.repository.EmpRepository;

import oracle.sql.ARRAY;

@AutoConfigureMockMvc
@SpringBootTest(classes = EmpApplication.class)
class EmpControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	private Emp emp1;
	
	@BeforeEach
	void createEmp() {
		emp1 = new Emp(1001, "河原崎長一郎", "営業", 720, 34, 2);	
	}

	
	@Test
	void findAll処理でモデルのメッセージにempsが渡される() throws Exception {
		this.mockMvc.perform(get("/emps/findAll"))
			.andExpect(model()
					.attribute("emps", null));

	}

	private Object hasProperty(String string, Integer integer) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
