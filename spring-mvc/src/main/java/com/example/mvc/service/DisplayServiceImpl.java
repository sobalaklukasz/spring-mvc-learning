package com.example.mvc.service;

import com.example.mvc.model.Display;
import com.example.mvc.domain.DisplayDao;
import com.example.mvc.domain.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Hosh on 2017-05-24.
 */

@Service
public class DisplayServiceImpl implements DisplayService
{
    private final DisplayDao displayDao;

    @Autowired
    public DisplayServiceImpl(DisplayDao displayDao)
    {
        this.displayDao = displayDao;
    }

    @Override
    public List<Display> getAll()
    {
        return displayDao.getAll();
    }

}
