package com.example.springstarter03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ControllerTest {

    @Autowired
    private GetHashCodeClass getHashCodeClass;

    @Test
    public void testStarter(){
        System.out.println(getHashCodeClass.getHashCode());
    }
}
