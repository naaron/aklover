package com.aekyung.aklover.controller.web.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aekyung.aklover.common.CommonUtil;
import com.aekyung.aklover.mapper.web.board.BoardMapper;

@Controller
@RequestMapping(value = "/board", method= RequestMethod.GET)
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardMapper boardMapper;

	@RequestMapping(value = "/group_04_03")
	public String board(HttpServletRequest request, Model model) throws Exception {
		Map<String, Object> params = new HashMap<String, Object>();
		
		String code = CommonUtil.getBoardCodeUrl(request);
		
		params.put("hero_group", code);
		List<Map<String, Object>> list = boardMapper.selectBoardList(params);
		
		model.addAttribute("list", list);
		return "web/board/communityBoard";
	}
}
 