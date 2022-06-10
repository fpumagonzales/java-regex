package com.example.regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FindOcurrencesDemo {

  private static final Logger logger = LoggerFactory.getLogger(FindOcurrencesDemo.class);
  
  public static void main(String[] args) {
    // compile(regular expression)
    Pattern p = Pattern.compile("21");
    //---------------------0123456789012345678901234567890123456789
    Matcher m = p.matcher("434544e2143n54s3621335A23145213563214567");
    
    int count = 0;
    while(m.find()) {
      logger.info("start:{} end:{}", m.start(), m.end());//start:7 end:9
      count++;
    }
    
    logger.info("count:{}", count); // 4

  }

}
