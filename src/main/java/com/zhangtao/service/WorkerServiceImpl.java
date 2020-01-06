package com.zhangtao.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangtao.bean.Worker;
import com.zhangtao.mapper.WorkerMapper;

@Service
public class WorkerServiceImpl implements WorkerService {
	@Resource
	private WorkerMapper workerMapper;

	public List<Worker> queryAll(Map<String, Object> map) {
		return workerMapper.queryAll(map);
	}

	public Worker queryOne(String wid) {
		// TODO Auto-generated method stub
		return workerMapper.queryOne(wid);
	}

	public int update(Worker worker) {
		// TODO Auto-generated method stub
		return workerMapper.update(worker);
	}
}
