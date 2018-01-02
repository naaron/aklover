package com.aekyung.aklover.controller.web;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aekyung.aklover.mapper.web.LoginMapper;

@Controller
public class LoginController {
	
	@Autowired
	private LoginMapper loginMapper;
	
	
	@RequestMapping(value = "/login", method= RequestMethod.GET)
    public String root(Model model) throws Exception {
        //List<Map<String, Object>> list = loginMapper.selectHeroGroup();
        
        //model.addAttribute("result", list);
        
        return "web/login/index";
    }
}
