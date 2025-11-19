package org.lxz.wordpocket.infrastructure.database.dto;

import org.lxz.wordpocket.domain.model.Explanation;
import org.lxz.wordpocket.domain.model.PartOfSpeech;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("explanations")
public record ExplanationDTO(@Id Long id, PartOfSpeech partOfSpeech, String meaning, String exampleSentence) {

  public static ExplanationDTO toExplanationDTO(Explanation explanation) {
    return new ExplanationDTO(explanation.getId(),explanation.getPartOfSpeech(), explanation.getMeaning(),
        explanation.getExampleSentence());
  }

  public Explanation toExplanation() {
    return new Explanation(this.id,this.partOfSpeech, this.meaning, this.exampleSentence);
  }
}
