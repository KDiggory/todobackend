package com.bae.todo.config;

import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Collections;

import org.modelmapper.ModelMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration 
@EnableMongoRepositories(basePackages = { "com.bae.todo" })
@ComponentScan(basePackages = { "com.bae.todo.*" })
@PropertySource("classpath:application.properties")

public class AppConfig {

	@Bean 
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	@Bean
    public MongoClient mongo() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/todolist");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
          .applyConnectionString(connectionString)
          .build();
        
        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "todolist");
    }
}