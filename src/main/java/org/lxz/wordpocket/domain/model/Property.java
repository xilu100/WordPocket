package org.lxz.wordpocket.domain.model;

import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

@Setter
@Getter
public class Property {

  @Id
  private Long id;
  private List<Explanation> explanations;     //解释（词性，翻译，例句）
  private Language language;                  // 语种（英，德，法....）
  private Set<String> tags;                   // 标签
  private String note;                        // 补充说明（全称，完整意思，记忆方法等）

  @PersistenceCreator
  public Property(Long id, List<Explanation> explanations, Language language, Set<String> tags,
      String note) {
    this.id = id;
    this.explanations = explanations;
    this.language = language;
    this.tags = tags;
    this.note = note;
  }

}
