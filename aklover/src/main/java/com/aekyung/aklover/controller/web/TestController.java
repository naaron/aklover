package com.aekyung.aklover.controller.web;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aekyung.aklover.mapper.web.BoardMapper;




@Controller
public class TestController {
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	@RequestMapping(value = "/", method= RequestMethod.GET)
    public String root(Model model) throws Exception {
        List<Map<String, Object>> list = boardMapper.selectHeroGroup();
        
        model.addAttribute("result", list);
        
        return "main/index";
    }
}
