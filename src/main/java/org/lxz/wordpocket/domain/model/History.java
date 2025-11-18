package org.lxz.wordpocket.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.PersistenceCreator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class History {
    private LocalDateTime firstRecordTime;       // 第一次记录时间
    private List<LocalDateTime> queryTimes;      // 所有查询时间（包含第一次记录）
    private LocalDateTime lastQueryTime;         // 最近一次查询时间

    @PersistenceCreator
    public History(LocalDateTime firstRecordTime, List<LocalDateTime> queryTimes, LocalDateTime lastQueryTime) {
        this.firstRecordTime = firstRecordTime;
        this.queryTimes = queryTimes;
        this.lastQueryTime = lastQueryTime;
    }

    public static History createFirst() {
        LocalDateTime now = LocalDateTime.now();
        return new History(
                now,
                List.of(now),
                now
        );
    }

    public History recordQuery() {
        LocalDateTime now = LocalDateTime.now();

        List<LocalDateTime> newQueryTimes = new ArrayList<>(queryTimes);
        newQueryTimes.add(now);

        return new History(
                firstRecordTime,
                newQueryTimes,
                now
        );
    }
}
