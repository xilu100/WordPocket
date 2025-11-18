package org.lxz.wordpocket.domain.model;

import lombok.Data;
import org.lxz.wordpocket.infrastructure.Annotation.AggregateRoot;
import org.springframework.data.annotation.Id;

@Data
@AggregateRoot
public class Vocabulary {
    @Id
    private Long id;

    private String word;                // 单词（Unique）
    private Properties properties;      // 单词属性
    private History history;            // 查询或者记录时间（第一次记录，记录，最近一次查询）
    private String location;            // 记录地点（option）
    private String picture;             // 图片记忆
}
