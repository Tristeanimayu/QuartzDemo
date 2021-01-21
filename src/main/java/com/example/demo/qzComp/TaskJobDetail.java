package com.example.demo.qzComp;

import com.example.demo.utils.TimesStamp;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import lombok.extern.slf4j.Slf4j;

/**
 * @project: 郭鹏飞的博客(wwww.pengfeiguo.com)
 * @description: quartz job 业务处理类
 * @version 1.0.0
 * @errorcode
 *            错误码: 错误描述
 * @author
 *         <li>2020-09-04 825338623@qq.com Create 1.0
 * @copyright ©2019-2020
 */

//fixme 一个触发器绑定一个任务,但一个任务可以被多个触发器调用,禁止并行即限制同时调用

@DisallowConcurrentExecution  //将作业类标记为不能并行
@Slf4j
public class TaskJobDetail extends QuartzJobBean {

    TimesStamp timesStamp = new TimesStamp();

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.info("begin delwith batch task >>>>>>>>>>>>>>>>>>>>>>>");
        String batchId = context.getJobDetail().getKey().getName();
        String time = timesStamp.timesStamp();
        log.info("执行的任务id为：[{}]", batchId);
        log.info("执行任务time为：[{}]", time);
    }
    
}
