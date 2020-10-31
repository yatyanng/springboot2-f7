package com.example.onsenui;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot {

  private static final Logger log = LoggerFactory.getLogger(Boot.class);

  public static void main(String[] args) {
    String configDirectory = "conf";
    if (args.length > 0) {
      configDirectory = args[0];
    }
    log.info("config directory: {}", configDirectory);
    System.setProperty("spring.config.location", configDirectory + "/springboot.yml");
    System.setProperty("logging.config", configDirectory + "/logback.xml");
    System.setProperty("spring.resources.static-locations", "classpath:/static/");
    SpringApplication.run(Boot.class, args);
  }
}
