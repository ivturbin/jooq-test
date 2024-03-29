package dev.turbin.jooqtest.config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.codegen.GenerationTool;
import org.jooq.impl.DSL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class Config {

    Config() {
        try {
            GenerationTool.generate(
                    Files.readString(
                            Path.of("src/main/resources/jooq-config.xml")
                    )
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    Connection getConnection() {
        String userName = "psint";
        String password = "psint-psint";
        String url = "jdbc:postgresql://10.125.29.220:5432/db04";
        try {
            return DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    DSLContext getContext(Connection conn) {
        return DSL.using(conn, SQLDialect.POSTGRES);
    }
}
