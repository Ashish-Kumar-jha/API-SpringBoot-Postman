package com.spring.mongoCrud;

import com.spring.mongoCrud.Service.MongoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MongoCrudApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("TEST Demo");
	}
	@Autowired
	MongoImpl mongo;
	@Test
	void sumtwo() {
		int actual=11;
		int expected=mongo.sumdata(5,5);
		assertEquals(expected,actual,"Logical mistake in adding data");
	}

}
