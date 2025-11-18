package org.lxz.wordpocket.domain.model;

import org.springframework.data.annotation.Id;

public class Vocabulary {
    @Id
    private Long id;

    private String word;                // 单词（Unique）
    private String meanings;            // 解释（主意思+延伸意思1，,2，,3...)
    private Language language;          // 语种（英，德，法....）
    private PartOfSpeech partOfSpeech;  // 词性（n，adj，v...）
    private Category category;          // 分类（不同的词性有不同的分类）
    private String explanation;         // 补充说明（全称，完整意思，记忆方法等）
    private String exampleSentence;     // 例句
    private History history;             // 查询或者记录时间（第一次记录，记录，最近一次查询）
    private String location;            // 记录地点（option）
    private String picture;             // 图片记忆
}
