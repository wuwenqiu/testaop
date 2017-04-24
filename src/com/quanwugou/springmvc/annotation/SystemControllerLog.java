package com.quanwugou.springmvc.annotation;

import java.lang.annotation.*;

/**  
 
 */    
    
@Target({ElementType.METHOD})    
@Retention(RetentionPolicy.RUNTIME)    
@Documented 
public @interface SystemControllerLog {
	String description()  default "";   
}
