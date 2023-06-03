package com.fiap.rm344474.trabalho;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class TesteConnection {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testDatabaseConnection() {
        int result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
        System.out.println("Connection successful. Result: " + result);
    }
}