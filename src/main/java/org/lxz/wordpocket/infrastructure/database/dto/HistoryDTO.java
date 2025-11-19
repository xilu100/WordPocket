package org.lxz.wordpocket.infrastructure.database.dto;

import java.time.LocalDateTime;
import java.util.List;
import org.lxz.wordpocket.domain.model.History;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("history")
public record HistoryDTO(@Id Long id, LocalDateTime firstRecordTime, List<LocalDateTime> queryTimes,
                         LocalDateTime lastQueryTime) {

  public static HistoryDTO toHistoryDTO(History history) {
    return new HistoryDTO(history.getId(),history.getFirstRecordTime(), history.getQueryTimes(),
        history.getLastQueryTime());
  }

  public History toHistory() {
    return new History(this.id,this.firstRecordTime, this.queryTimes, this.lastQueryTime);
  }
}
