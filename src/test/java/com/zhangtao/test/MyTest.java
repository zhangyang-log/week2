package com.zhangtao.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.utils.DateUtil;
import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;
import com.zhangtao.bean.Worker;
import com.zhangtao.mapper.WorkerMapper;

public class MyTest {
	public static void main(String[] args) {
		// 1 安徽皖泰矿山 振动筛（旋振筛，实验筛，高频筛，滚筒筛，直线筛，摇摆筛，气流筛）螺旋输送机，斗提 安徽皖泰矿山机械设备有限公司
		// 振动筛（旋振筛，实验筛，高频筛，滚筒筛，直线筛，摇摆筛，气流筛）螺旋输送机，斗提 新乡市经济开发区恒宇路8号 500 2005-07-22
		// 未年检
		// o[0] o[1] o[2] o[3] o[4] o[5] o[6] o[7] o[9]
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		WorkerMapper mapper = ac.getBean(WorkerMapper.class);
		List<Object[]> list = IOUtils.readFile("src/test/resources/cms附件-机械设备公司年检信息.txt", "\\|");
		/*
		 * 
		 * .id值要使用isNumber()工具方法判断是不是数字（3分） b. keywords{关键字}
		 * 、description{描述}、公司名称、主营产品、地址要使用 hasText()方法判断有没有值。（3分） c.
		 * 注册资本要使用hasText()方法判断有没有值，并使用 isNumber()判断是不是数字（3分）
		 * d.年检日期为null，在前端必须显示为空，不能显示null（3分） c.
		 * 成立时间要使用hasText()方法判断有没有值,判断是不是日期 类型（3分）
		 * 
		 * 
		 */
		for (Object[] o : list) {
			if (!StringUtil.isNumber(o[0] + "")) {
				System.out.println(o[0] + "不是数字");
			} else if (StringUtil.isEmpty(o[1] + "")) {
				System.out.println(o[0] + "是空");
			} else if (!StringUtil.isNumber(o[6] + "")) {
				System.out.println(o[0] + "是空");
			} else if (StringUtil.isEmpty(o[2] + "")) {
				System.out.println(o[0] + "是空");
			} else if (StringUtil.isEmpty(o[3] + "")) {
				System.out.println(o[0] + "是空");
			} else if (StringUtil.isEmpty(o[4] + "")) {
				System.out.println(o[0] + "是空");
			} else {
				Date wtime = DateUtil.stringToDate(o[7] + "");
				Worker worker = new Worker(Integer.parseInt(o[0] + ""), o[1] + "", o[2] + "", o[3] + "", o[4] + "",
						o[5] + "", Integer.parseInt(o[6] + ""), wtime, null, "", "");
				mapper.addWorker(worker);
			}
		}
	}
}