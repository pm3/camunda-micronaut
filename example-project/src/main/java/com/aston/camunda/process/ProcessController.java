package com.aston.camunda.process;

import com.aston.camunda.externaltask.Camunda;
import com.aston.camunda.externaltask.ExternalTaskSubscription;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

@Controller("/pm")
@Camunda
public class ProcessController {

    private final static Logger LOGGER = LoggerFactory.getLogger(ProcessController.class);

    @Get("/random")
    @ExternalTaskSubscription(topic = "/pm/random")
    public PmProcessData random() {
        Random random = new Random();
        PmProcessData data = new PmProcessData();
        data.setA(Math.abs(random.nextInt() % 100));
        data.setB(Math.abs(random.nextInt() % 100));
        data.setC(0);
        data.setD(new PmProcessData());
        data.getD().setB(123);
        LOGGER.info("rendom {}", data);
        return data;
    }

    @Post("/verify")
    @ExternalTaskSubscription(topic = "/pm/verify")
    public void verify(@Body PmProcessData data) {
        LOGGER.info("verify {}", data);
        if (data.getA() != null && data.getB() != null && data.getC() != null && data.getA() + data.getB() == data.getC()) {
            LOGGER.info("ok {}+{}={}", data.getA(), data.getB(), data.getC());
        } else {
            LOGGER.info("no ok {}+{}={}", data.getA(), data.getB(), data.getC());
        }
    }

    @Post("/counter")
    @ExternalTaskSubscription(topic = "/pm/counter")
    public PmProcessData counter(@Body PmProcessData data) {
        LOGGER.info("counter {}", data);
        PmProcessData data2 = new PmProcessData();
        data2.setA(data.getA() != null ? data.getA() + 1 : 1);
        return data2;
    }
}
