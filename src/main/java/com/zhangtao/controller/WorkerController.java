package com.zhangtao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangtao.bean.Worker;
import com.zhangtao.service.WorkerService;

@Controller
public class WorkerController {
	@Resource
	private WorkerService workerService;

	/**
	 * 
	 * a. id编号模糊查询（2分）wid b. keywords模糊查询（2分）wname c. description模糊查询（2分）whear
	 * d. 公司名称模糊查询（2分）workname e. 主营产品模糊查询（2分）produces f. 地址模糊查询（2分）addr g.
	 * 注册资本范围查询（2分）money h. 成立时间范围查询（2分）wtime i. 年检日期范围查询（2分）ntime j.
	 * 年检状态选择查询，手工输入计0（2分）ntype @RequestMapping("tolist")
	 */
	@RequestMapping("tolist")
	public String queryAll(@RequestParam(defaultValue = "1") int pageNum, Model model, String wname, String whear,
			String workname, String produces, String addr, String money1, String money2, String wtime1, String wtime2,
			String ntime1, String ntime2, String tid, String wid) {
		PageHelper.startPage(pageNum, 3);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("wname", wname);
		map.put("wid", wid);
		map.put("whear", whear);
		map.put("workname", workname);
		map.put("produces", produces);
		map.put("addr", addr);
		map.put("money1", money1);
		map.put("money2", money2);
		map.put("wtime1", wtime1);
		map.put("wtime2", wtime2);
		map.put("ntime1", ntime1);
		map.put("ntime2", ntime2);
		map.put("pageNum", pageNum);
		map.put("ntype", tid);
		List<Worker> list = workerService.queryAll(map);
		PageInfo<Worker> info = new PageInfo<Worker>(list);
		model.addAttribute("info", info);
		model.addAttribute("map", map);
		return "list";
	}

	@RequestMapping("tofind")
	public String tofind(String wid, Model model) {
		Worker worker = workerService.queryOne(wid);
		model.addAttribute("worker", worker);
		return "update";
	}

	@RequestMapping("update")
	public String update(Worker worker, Model model) {
		int i = workerService.update(worker);
		if (i > 0) {
			return "redirect:tolist";
		} else {
			model.addAttribute("error", "审核未通过");
			return "update";
		}
	}
}
