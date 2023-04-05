package com.aston.camunda.externaltask;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface ExternalTaskSubscription {
    String topic();

    long timeout() default 10_000;

    boolean localVariables() default false;

    boolean processVariables() default false;
}
