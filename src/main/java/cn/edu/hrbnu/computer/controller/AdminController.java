package cn.edu.hrbnu.computer.controller;

import cn.edu.hrbnu.computer.pojo.Admin;
import cn.edu.hrbnu.computer.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;


    // yaque
    @RequestMapping("/loginDeal")
    public String loginAdmin(Model model, Admin admin) {
        Admin remoteAdmin = adminService.queryByName(admin.getName());
        if (remoteAdmin == null) {
            model.addAttribute("message", "账号不存在");
            return "index";
        }else if (remoteAdmin.getPassword().equals(admin.getPassword())) {
            model.addAttribute("admin", admin);
            return "/admin/main";
        }else {
            return "index";
        }
    }

    //yaque
    @RequestMapping("/main")
    public String Main(Model model, Admin admin) {
        return "admin/main";
    }
}
