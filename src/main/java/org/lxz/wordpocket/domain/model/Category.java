package org.lxz.wordpocket.domain.model;

public enum Category {

    /*
    N - 名词
    */
    DAILY_USE,       // 日常用品
    ELECTRONICS,     // 电子产品
    FOOD,            // 食物
    CLOTHING,        // 衣物
    ANIMAL,          // 动物
    PLANT,           // 植物
    PLACE_N,         // 地点
    PERSON,          // 人物
    ABSTRACT,        // 抽象概念
    VEHICLE,         // 交通工具
    TOOL,            // 工具
    SPORT,           // 运动

    /*
    VERB - 动词
    */
    ACTION,          // 行动
    STATE,           // 状态
    PROCESS,         // 过程/变化
    THINK,           // 思考
    SPEAK,           // 说/讲
    MOVE,            // 移动
    CREATE,          // 创造
    DESTROY,         // 破坏
    FEEL,            // 感觉
    INTERACT,        // 互动/交流

    /*
    ADJECTIVE - 形容词
    */
    DESCRIBE_PERSON, // 描述人
    DESCRIBE_OBJECT, // 描述物品
    DESCRIBE_FEELING,// 描述情感/状态
    SIZE,            // 大小
    COLOR,           // 颜色
    SHAPE,           // 形状
    MATERIAL,        // 材料
    TEMPERATURE,     // 温度
    TASTE,           // 味道
    SPEED,           // 速度
    QUANTITY,        // 数量

    /*
    ADV - 副词
    */
    FREQUENCY,       // 频率（always, often, sometimes）
    TIME_ADV,        // 时间（yesterday, now, soon）
    PLACE_ADV,       // 地点（here, there, everywhere）
    MANNER_ADV,      // 方式（slowly, carefully）
    DEGREE,          // 程度（very, quite, extremely）
    CERTAINTY,       // 确定性（certainly, probably）
    NEGATION,        // 否定（not, never）
    CONJUNCTION,     // 连接副词（however, therefore）
    INTERROGATIVE,   // 疑问副词（why, how）
    FOCUS,           // 强调/焦点（only, even, just）
    RELATIVE,         // 关系副词（where, when, how）

    /*
    PREP - 介词
    */
    PLACE,          // 地点（in, on, at, above, below）
    TIME_PERP,           // 时间（at, on, in, during, since）
    DIRECTION,      // 方向（to, from, toward, into, out of）
    AGENT,          // 施事/工具（by, with）
    REASON,         // 原因/目的（for, because of, due to）
    COMPARISON,     // 比较（than, as…as）
    POSSESSION,     // 所有关系（of, with）
    MANNER_,         // 方式（by, with, in）
    CONDITION,      // 条件（without, except, but for）
    RELATIONSHIP,    // 关系/连接（about, concerning, regarding）

    /*
    CONJ - 连词
    */
    COORDINATING,    // 并列连词（and, but, or）
    SUBORDINATING,   // 从属连词（because, although, if）
    CORRELATIVE,     // 对应连词（either…or, neither…nor）
    CONJ_PHRASE,     // 短语连词（as well as, in order that）

    /*
    PRON - 代词
    */
    PERSONAL,        // 人称代词（I, you, he, she, it）
    POSSESSIVE,      // 物主代词（my, your, his, her, its, our, their）
    REFLEXIVE,       // 反身代词（myself, yourself, himself）
    DEMONSTRATIVE,   // 指示代词（this, that, these, those）
    INTERROGATIVE_PRON, // 疑问代词（who, what, which）
    RELATIVE_PRON,   // 关系代词（who, whom, whose, which, that）
    INDEFINITE,      // 不定代词（someone, anybody, each）

    /*
    PHRASE - 短语
    */
    IDIOM,           // 成语/惯用语（kick the bucket, piece of cake）
    COLLOCATION,     // 搭配（make a decision, take a break）
    PREP_PHRASE,     // 介词短语（in the morning, at the station）
    PHRASAL_VERB     // 短语动词（give up, look after）

}

