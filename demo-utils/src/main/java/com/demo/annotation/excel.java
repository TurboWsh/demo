package com.demo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Turbo
 * @date 17/11/17.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface excel {

    String exclName() default "";
}
