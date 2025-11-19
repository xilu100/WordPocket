package org.lxz.wordpocket.infrastructure.database.dto;

import org.lxz.wordpocket.domain.model.Vocabulary;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("vocabulary")
public record VocabularyDTO(@Id Long id, String word, PropertyDTO properties, HistoryDTO history,
                            String location,
                            PictureDTO picture) {

  public static VocabularyDTO toVocabularyDTO(Vocabulary vocabulary) {
    return new VocabularyDTO(
        vocabulary.getId(),
        vocabulary.getWord(),
        PropertyDTO.toPropertyDTO(vocabulary.getProperties()),
        HistoryDTO.toHistoryDTO(vocabulary.getHistory()),
        vocabulary.getLocation(),
        PictureDTO.toPictureDTO(vocabulary.getPicture()));
  }

  public Vocabulary toVocabulary() {
    return new Vocabulary(this.id, this.word, this.properties.toProperty(),
        this.history.toHistory(), this.location,
        this.picture.toPicture());
  }
}
