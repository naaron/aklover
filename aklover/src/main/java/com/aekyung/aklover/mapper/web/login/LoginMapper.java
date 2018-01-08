package com.aekyung.aklover.mapper.web.login;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

public interface LoginMapper {
	List<Map<String, Object>> selectLoginMember(Map<String, Object> map) throws Exception;
	
}
