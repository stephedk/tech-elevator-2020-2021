package com.techelevator.models.data;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.print.DocFlavor;
import javax.sql.DataSource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatabaseLogger implements Logger
{

    private JdbcTemplate jdbcTemplate;

    public DatabaseLogger(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void log(String action, BigDecimal begin, BigDecimal end)
    {
        Date time = new Date();

        String insert = "INSERT INTO logs (log_date, action, start_credit, end_credit) " +
                " VALUES (?,?,?,?);";

        jdbcTemplate.update(insert, time, action, begin, end);

    }
}
