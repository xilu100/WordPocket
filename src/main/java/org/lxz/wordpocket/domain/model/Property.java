package org.lxz.wordpocket.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Setter
@Getter
public class Property {

    private List<Explanation> explanations;     //解释（词性，翻译，例句）
    private Language language;                  // 语种（英，德，法....）
    private Set<String> tags;                   // 标签
    private String note;                        // 补充说明（全称，完整意思，记忆方法等）

    public Property(List<Explanation> explanations, Language language, Set<String> tags, String note) {
        this.explanations = explanations;
        this.language = language;
        this.tags = tags;
        this.note = note;
    }

}
