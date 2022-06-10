package com.example.regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatternDemo {
  private static final Logger logger = LoggerFactory.getLogger(PatternDemo.class);

  public static void main(String[] args) {

    // compile(regular expression)
    Pattern p = Pattern.compile("@gmail");

    // matcher(input string)
    Matcher m1 = p.matcher("user01@hotmail.com");
    Matcher m2 = p.matcher("user01@gmail.com");

    logger.info("m1:{}", m1.find()); // false
    logger.info("m2:{}", m2.find()); // true

  }

}
