package com.micredis.sprngmvn;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class DemoRest {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String getData() {
        return String.valueOf(Math.random());
    }

//    @RequestMapping(value = "/demo", method = RequestMethod.POST)
//    public String getDataPost() {
//        return "POST" + String.valueOf(Math.random());
//    }

    @RequestMapping(value = "/date",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Demo date() {
        return new Demo(new Random().nextInt(), getData());
    }

    // Substitute values of a and b correspondingly
    @RequestMapping(value = "/date",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Demo update(@RequestBody Demo demo) {
        String a = String.valueOf(demo.getA());
        demo.setA(Integer.parseInt(demo.getB()));
        demo.setB(a);
        return demo;
    }


//    @RequestMapping(value = "/date_xml", produces = MediaType.APPLICATION_XML_VALUE)
//    @ResponseBody
//    public Demo date_xml() {
//        return new Demo(getData(), getData());
//    }
}
