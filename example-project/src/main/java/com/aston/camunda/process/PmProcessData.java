package com.aston.camunda.process;

public class PmProcessData {

    Integer a;
    Integer b;
    Integer c;

    PmProcessData d;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public PmProcessData getD() {
        return d;
    }

    public void setD(PmProcessData d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "PmProcessData{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
