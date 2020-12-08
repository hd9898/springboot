package cn.hd.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@RestController
public class JdbcTemplateController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("query")
    public  List<Map<String, Object>>  query(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from account");
        return maps;
    }
}
