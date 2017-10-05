package com.micredis.sprngmvn;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Demo {
    private Integer a;
    private String b;
    private Demo d;

    public Demo() {

    }

    public Demo(Integer a, String b, Demo d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }

    public Integer getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public Demo getD() {
        return d;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setD(Demo d) {
        this.d = d;
    }
}
