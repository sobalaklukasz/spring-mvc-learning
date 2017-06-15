package com.example.mvc.domain;

import com.example.mvc.model.Device;
import com.example.mvc.model.Display;

import java.util.List;

/**
 * Created by Hosh on 2017-05-24.
 */
public interface DeviceDao
{
    List<Device> getAll();
    List<Display> getDisplays(Device device);
}
