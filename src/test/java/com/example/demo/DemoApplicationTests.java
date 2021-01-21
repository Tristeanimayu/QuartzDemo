package com.example.demo;

import com.example.demo.utils.TimesStamp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test

    void test1(){
        TimesStamp timesStamp = new TimesStamp();
        String string = timesStamp.timesStamp();
        String string2 = timesStamp.timesReal();
        System.out.println(string);
        System.out.println(string2);
    }



}
