package com.aekyung.aklover.mapper.web.board;

import java.util.List;
import java.util.Map;

public interface BoardMapper {
	List<Map<String, Object>> selectHeroGroup() throws Exception;
	List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception;
}
