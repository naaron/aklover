package com.aekyung.aklover.controller.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aekyung.aklover.mapper.web.LoginMapper;

@Controller
public class LoginController {
	
	@Autowired
	private LoginMapper loginMapper;
	
	@RequestMapping(value = "/login", method= RequestMethod.GET)
    public String login() throws Exception {
        return "web/login/login";
    }
	
	@RequestMapping(value = "/login", method= RequestMethod.POST)
	@ResponseBody
    public Map<String, Object> loginProc(@RequestParam Map<String, Object> params) throws Exception {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		List<Map<String, Object>> list = loginMapper.selectLoginMember(params);
		
		if(list.isEmpty()) {
			jsonResult.put("result", false);
			jsonResult.put("msg", "아이디와 비밀번호를 확인해주세요.");
		}else {
			jsonResult.put("result", true);
		}
		
		return jsonResult; 
    }
}
