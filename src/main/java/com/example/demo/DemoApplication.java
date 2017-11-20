package com.example.demo;

import com.example.demo.ch6.config.BookSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
	@Value("${book.author}")
	private String author;
	@Value("${book.name}")
	private String name;
	@Autowired
	private BookSettings bookSettings;

	@RequestMapping("/")
	public String index() {
		return "book Author:" + bookSettings.getAuthor()
				+ ", Name: " + bookSettings.getName();
	}

	public static void main(String[] args) {
		SpringApplication springApplication =
				new SpringApplication(DemoApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}
}
