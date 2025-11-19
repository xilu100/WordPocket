package org.lxz.wordpocket.domain.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

@Getter
@Setter
public class Explanation {

  @Id
  private Long id;
  private PartOfSpeech partOfSpeech;
  private String meaning;
  private String exampleSentence;

  @PersistenceCreator
  public Explanation(Long id, PartOfSpeech partOfSpeech, String meaning, String exampleSentence) {
    this.id = id;
    this.partOfSpeech = partOfSpeech;
    this.meaning = meaning;
    this.exampleSentence = exampleSentence;
  }
}
