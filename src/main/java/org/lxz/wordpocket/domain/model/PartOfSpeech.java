package org.lxz.wordpocket.domain.model;

public enum PartOfSpeech {
    CN, // 可数名词
    UCN,// 不可数名词
    V, // 动词，表示动作、状态或事件
    ADJ, // 形容词，修饰名词，表示性质、状态、特征等
    ADV, // 副词，修饰动词、形容词或副词，表示方式、时间、程度等
    PREP, // 介词，表示关系、方向、位置等
    CONJ, // 连词，连接词、短语或句子，表示逻辑关系
    PRON, // 代词，替代名词，如“他”、“她”、“它”等
    PHRASE, // 短语，多个词组成的语法单位，非单个词
    OTHER // 其他词性，如标点、数字、专有名词等
}
