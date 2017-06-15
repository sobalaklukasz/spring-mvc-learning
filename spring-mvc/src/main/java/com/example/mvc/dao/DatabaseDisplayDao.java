package com.example.mvc.dao;

import com.example.mvc.domain.DisplayDao;
import com.example.mvc.model.Display;
import com.example.mvc.utils.DatabaseMock;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Hosh on 2017-05-24.
 */

@Repository
public class DatabaseDisplayDao implements DisplayDao
{
    @Override
    public List<Display> getAll()
    {
        return DatabaseMock.getDisplays();
    }

}
