package org.lxz.wordpocket.domain.model;

import java.time.LocalDateTime;
import java.util.List;

public class History {
    private LocalDateTime firstRecordTime;       // 第一次记录时间
    private List<LocalDateTime> queryTimes;      // 所有查询时间（包含第一次记录）
    private LocalDateTime lastQueryTime;         // 最近一次查询时间
    private int queryCount;
}
