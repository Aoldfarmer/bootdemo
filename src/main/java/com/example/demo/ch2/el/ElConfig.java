package com.example.demo.ch2.el;

import com.example.demo.BaseLogger;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.example.demo.ch2.el")
@PropertySource("classpath:test.properties")
public class ElConfig extends BaseLogger {

    @Value("I love you")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{demoService111.another}")
    private String fromAnother;

    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
          LOG.debug("normal:{}", normal);
          LOG.debug("osName:{}", osName);
          LOG.debug("randomNumber:{}", randomNumber);
          LOG.debug("fromAnother:{}", fromAnother);
          LOG.debug(org.apache.commons.io.IOUtils.toString(testFile.getInputStream()));
          LOG.debug(IOUtils.toString(testUrl.getInputStream()));
          LOG.debug("bookName:{}", bookName);
          LOG.debug(environment.getProperty("book.author"));
        } catch (Exception e) {
            LOG.debug(e.getMessage(), e);
        }
    }
}
