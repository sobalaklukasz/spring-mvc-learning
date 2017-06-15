package com.example.mvc.utils;

import com.example.mvc.model.Device;
import com.example.mvc.model.Display;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Hosh on 2017-05-26.
 */
public class DatabaseMock
{
    static Display d0 = new Display("n0","m0",0);
    static Display d1 = new Display("n1","m1",1);
    static Display d2 = new Display("n2","m1",2);
    static Display d3 = new Display("n3","m2",3);
    static Display d4 = new Display();

    static Device dev0 = new Device(Arrays.asList(d0,d1,d2));
    static Device dev1 = new Device(Arrays.asList(d3));
    static Device dev2 = new Device();

    public static List<Display> getDisplays()
    {
        return Arrays.asList(d0,d1,d2,d3,d4);
    }

    public static List<Device> getDevices()
    {
        return Arrays.asList(dev0,dev1,dev2);
    }

    static public Display getD0()
    {
        return d0;
    }

    static public Display getD1()
    {
        return d1;
    }

    static public Display getD2()
    {
        return d2;
    }

    static public Display getD3()
    {
        return d3;
    }

    static public Display getD4()
    {
        return d4;
    }

    static public Device getDev0()
    {
        return dev0;
    }

    static public Device getDev1()
    {
        return dev1;
    }

    static public Device getDev2()
    {
        return dev2;
    }
}
