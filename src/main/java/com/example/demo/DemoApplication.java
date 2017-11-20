package com.example.demo;

import com.example.demo.ch6.config.BookSettings;
import com.example.demo.ch7.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
	public String index(Model model) {
		Person single = new Person("aa", 11);

		List<Person> people = new ArrayList<>();
		Person p1 = new Person("xxx", 11);
		Person p2 = new Person("yyy", 22);
		Person p3 = new Person("zzz", 33);
		people.add(p1);
		people.add(p2);
		people.add(p3);

		model.addAttribute("singlePerson", single);
		model.addAttribute("people", people);

		return "index";
	}

	public static void main(String[] args) {
		SpringApplication springApplication =
				new SpringApplication(DemoApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}
}
