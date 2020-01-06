package com.zhangtao.service;

import java.util.List;
import java.util.Map;

import com.zhangtao.bean.Worker;

public interface WorkerService {
	List<Worker> queryAll(Map<String, Object> map);

	Worker queryOne(String wid);

	int update(Worker worker);
}
