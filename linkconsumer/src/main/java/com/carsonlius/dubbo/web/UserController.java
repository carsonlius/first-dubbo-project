package com.carsonlius.dubbo.web;

import com.carson.dubbo.model.SystemLogDetails;
import com.carson.dubbo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private LogService logService;

    @GetMapping(value = "test")
    @ResponseBody
    public Object test(Integer id)
    {
        return logService.getLogById(id);
    }

    @RequestMapping(value = "/log")
    public String logDetail(Model model, Integer id){
      SystemLogDetails systemLogDetails = logService.getLogById(id);

      model.addAttribute("log", systemLogDetails);
        return "logDetail";
    }

}
