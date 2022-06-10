package com.example.regex.demo;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MatchesDemo {
  
  private static final Logger logger = LoggerFactory.getLogger(MatchesDemo.class);

  private static final String MAIL = "mail";

  public static void main(String[] args) {
    
    //Matcher.matches
    //Attempts to match the ENTIRE REGION against the pattern.
    
    // matches(regular expression, input string)
    boolean b0 = Pattern.matches(MAIL, "mail");
    boolean b1 = Pattern.matches(MAIL, "mymail");
    boolean b2 = Pattern.matches(MAIL, "mymailisyahoomail");
    boolean b3 = Pattern.matches(MAIL, "254556788");
    
    logger.info("b1:{}", b0);// true
    logger.info("b1:{}", b1);// false
    logger.info("b2:{}", b2);// false
    logger.info("b3:{}", b3);// false

  }

}
