package com.example.mvc.service;

import com.example.mvc.domain.DeviceDao;
import com.example.mvc.domain.DeviceService;
import com.example.mvc.model.Device;
import com.example.mvc.model.Display;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Hosh on 2017-05-24.
 */

@Service
public class DeviceServiceImpl implements DeviceService
{
    private final DeviceDao deviceDao;

    @Autowired
    public DeviceServiceImpl(DeviceDao deviceDao)
    {
        this.deviceDao = deviceDao;
    }

    @Override
    public List<Device> getAll()
    {
        return deviceDao.getAll();
    }

    @Override
    public List<Display> getDisplays(Device device)
    {
        return deviceDao.getDisplays(device);
    }

}
