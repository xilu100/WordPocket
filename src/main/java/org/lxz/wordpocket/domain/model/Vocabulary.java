package org.lxz.wordpocket.domain.model;

import lombok.Getter;
import org.lxz.wordpocket.infrastructure.Annotation.AggregateRoot;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

@Getter
@AggregateRoot
public class Vocabulary {
    @Id
    private Long id;

    private final String word;                // 单词（Unique）
    private final Property properties;        // 单词属性
    private final History history;            // 查询或者记录时间（第一次记录，记录，最近一次查询）
    private final String location;            // 记录地点（option）
    private final Picture picture;            // 图片记忆

    @PersistenceCreator
    public Vocabulary(Long id, String word, Property properties, History history, String location, Picture picture) {
        this.id = id;
        this.word = word;
        this.properties = properties;
        this.history = history;
        this.location = location;
        this.picture = picture;
    }

    public static Vocabulary create(String word, Property properties, String location, Picture picture) {
        return new Vocabulary(null, word, properties, History.createFirst(), location, picture);
    }
}
