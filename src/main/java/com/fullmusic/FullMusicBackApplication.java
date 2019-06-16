package com.fullmusic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.fullmusic")
public class FullMusicBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullMusicBackApplication.class, args);
	}

}
