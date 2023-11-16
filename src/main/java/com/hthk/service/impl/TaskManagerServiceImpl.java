package com.hthk.service.impl;

import com.hthk.action.TaskManagerMainEntry;
import com.hthk.common.utils.CustomStringUtils;
import com.hthk.common.utils.LocalDateTimeUtils;
import com.hthk.fintech.config.AppConfig;
import com.hthk.fintech.model.task.ITask;
import com.hthk.fintech.service.basic.AbstractService;
import com.hthk.service.TaskManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

import static com.hthk.fintech.config.FintechStaticData.LOG_DEFAULT;
import static com.hthk.fintech.config.FintechStaticData.LOG_WRAP;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/16 15:29
 */
@Component
public class TaskManagerServiceImpl

        extends AbstractService implements TaskManagerService {

    private final static Logger logger = LoggerFactory.getLogger(TaskManagerServiceImpl.class);

    @PostConstruct
    @Override
    public LocalDateTime start() {

        LocalDateTime currentTime = LocalDateTimeUtils.getNow();
        List<ITask> taskList = loadAllTask(appConfig);
        String logStr = CustomStringUtils.buildWrapStr(taskList);
        logger.info(LOG_WRAP, "task list", logStr);

        return currentTime;
    }

    private List<ITask> loadAllTask(AppConfig appConfig) {
        return null;
    }

}
