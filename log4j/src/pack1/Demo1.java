package pack1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {  
  
	 public static Logger log =LogManager.getLogger(Demo1.class.getName());
      
    public static void main(String[] args) {  
    	
    log.info("i am info");
    log.debug("i am debug");
    log.error("i am error");
    log.fatal("i am fatal");
       
    }  
}