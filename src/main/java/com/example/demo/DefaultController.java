package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
public class DefaultController {

  @GetMapping
  public String home() {
    return "home";
  }

  @GetMapping("/redirect")
  public String redirect(@RequestParam("url") String url) {
    if (!StringUtils.isEmptyOrWhitespace(url)) {

    }
    else {
      url = "/";
    }

    return "redirect:".concat(url);
  }
}
