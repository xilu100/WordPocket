package org.lxz.wordpocket.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Set;

@Data
public class Properties {

    private List<Explanation> explanations;     //解释（词性，翻译，例句）
    private Language language;                  // 语种（英，德，法....）
    private Set<String> tag;                   // 标签
    private String explanation;                 // 补充说明（全称，完整意思，记忆方法等）
}
