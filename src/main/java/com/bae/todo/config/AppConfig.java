
package com.bae.todo.config;
import org.springframework.context.annotation.Configuration;



import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Collections;

import org.modelmapper.ModelMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration 
public class AppConfig {

	@Bean 
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}