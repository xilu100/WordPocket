package org.lxz.wordpocket.infrastructure.database.dto;

import org.lxz.wordpocket.domain.model.Vocabulary;
import org.springframework.data.annotation.Id;

public record VocabularyDTO(@Id Long id, String word, PropertyDTO properties, HistoryDTO history, PictureDTO picture) {
    public static VocabularyDTO from(Vocabulary vocabulary) {
        return new VocabularyDTO(
                vocabulary.getId(),
                vocabulary.getWord(),
                PropertyDTO.toPropertyDTO(vocabulary.getProperties()),
                HistoryDTO.toHistoryDTO(vocabulary.getHistory()),
                PictureDTO.toPictureDTO(vocabulary.getPicture()));
    }
}
