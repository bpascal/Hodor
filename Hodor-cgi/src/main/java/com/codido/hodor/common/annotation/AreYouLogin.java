package com.codido.hodor.common.annotation;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AreYouLogin {

    String[] value() default {};

}
