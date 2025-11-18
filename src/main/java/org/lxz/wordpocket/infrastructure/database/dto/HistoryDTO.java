package org.lxz.wordpocket.infrastructure.database.dto;

import org.lxz.wordpocket.domain.model.History;

import java.time.LocalDateTime;
import java.util.List;

public record HistoryDTO(LocalDateTime firstRecordTime, List<LocalDateTime> queryTimes, LocalDateTime lastQueryTime) {
    public static HistoryDTO toHistoryDTO(History history) {
        return new HistoryDTO(history.getFirstRecordTime(), history.getQueryTimes(), history.getLastQueryTime());
    }
    public static History toHistory(HistoryDTO historyDTO) {
        return new History(historyDTO.firstRecordTime(), historyDTO.queryTimes(), historyDTO.lastQueryTime());
    }
}
