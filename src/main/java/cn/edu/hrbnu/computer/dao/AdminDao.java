package cn.edu.hrbnu.computer.dao;

import cn.edu.hrbnu.computer.pojo.Admin;

public interface AdminDao {
    Admin queryByName(int name);
}
