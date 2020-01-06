package com.zhangtao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangtao.bean.Worker;

public interface WorkerMapper {

	void addWorker(Worker worker);

	List<Worker> queryAll(Map<String, Object> map);

	Worker queryOne(@Param("wid") String wid);

	int update(Worker worker);
}
