package com.eniso;


import com.eniso.hello_world.service.MyService;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Houssem
 */
public class MyTest {

    MyService service = new MyService();

    @Test
    public void simpleTest() {
        assertEquals(2, service.add(1, 1));
        assertEquals(201, service.add(200, 1));
//        assertEquals(202, service.add(200, 1));
    }

}
