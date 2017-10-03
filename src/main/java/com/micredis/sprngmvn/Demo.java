package com.micredis.sprngmvn;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Demo {
    private Integer a;
    private String b;

    public Demo() {

    }

    public Demo(Integer a, String b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }
}
