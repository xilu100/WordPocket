package org.lxz.wordpocket.domain.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

@Getter
@Setter
public class History {

  @Id
  private Long id;
  private LocalDateTime firstRecordTime;       // 第一次记录时间
  private List<LocalDateTime> queryTimes;      // 所有查询时间（包含第一次记录）
  private LocalDateTime lastQueryTime;         // 最近一次查询时间

  @PersistenceCreator
  public History(Long id, LocalDateTime firstRecordTime, List<LocalDateTime> queryTimes,
      LocalDateTime lastQueryTime) {
    this.id = id;
    this.firstRecordTime = firstRecordTime;
    this.queryTimes = queryTimes;
    this.lastQueryTime = lastQueryTime;
  }

  public static History createFirst() {
    LocalDateTime now = LocalDateTime.now();
    List<LocalDateTime> times = new ArrayList<>();
    times.add(now);  // 第一次记录
    return new History(null, now, times, now); // id = null，新建对象
  }

  public void recordQuery() {
    LocalDateTime now = LocalDateTime.now();
    if (this.queryTimes == null) {
      this.queryTimes = new ArrayList<>();
    }
    this.queryTimes.add(now);      // 新增查询时间
    this.lastQueryTime = now;      // 更新最近一次查询时间
  }

}
