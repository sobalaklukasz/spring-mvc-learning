package com.example.mvc.dao;

import com.example.mvc.domain.DeviceDao;
import com.example.mvc.model.Device;
import com.example.mvc.model.Display;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.mvc.utils.DatabaseMock.getDevices;

/**
 * Created by Hosh on 2017-05-24.
 */

@Repository
public class DatabaseDeviceDao implements DeviceDao
{
    @Override
    public List<Device> getAll()
    {
        return getDevices();
    }

    @Override
    public List<Display> getDisplays(Device device)
    {
        return getDevices().get(0).getDisplays();
    }

}
