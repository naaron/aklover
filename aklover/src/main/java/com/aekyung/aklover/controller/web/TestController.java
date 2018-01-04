package com.aekyung.aklover.controller.web;


import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aekyung.aklover.mapper.web.BoardMapper;

@Controller
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	@RequestMapping(value = "/", method= RequestMethod.GET)
    public String root(Model model) throws Exception {
        List<Map<String, Object>> list = boardMapper.selectHeroGroup();
        
        logger.info("index 페이지 실 행 ===");
        model.addAttribute("result", list);
        
        return "web/main/index";
    }
}
