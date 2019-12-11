package cn.edu.hrbnu.computer.service.impl;

import cn.edu.hrbnu.computer.dao.AdminDao;
import cn.edu.hrbnu.computer.pojo.Admin;
import cn.edu.hrbnu.computer.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin queryByName(int name) {
        return adminDao.queryByName(name);
    }
}
