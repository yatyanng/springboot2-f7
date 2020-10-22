package com.example.springboot2F7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimplePageController {

  @RequestMapping({"/", "/index.html"})
  public String indexPage() {
    return "index";
  }

}
