package org.lxz.wordpocket.infrastructure.database.dto;

import org.lxz.wordpocket.domain.model.Explanation;
import org.lxz.wordpocket.domain.model.PartOfSpeech;

public record ExplanationDTO(PartOfSpeech partOfSpeech, String meaning, String exampleSentence) {
    public static ExplanationDTO toExplanationDTO(Explanation explanation) {
        return new ExplanationDTO(explanation.partOfSpeech(), explanation.meaning(), explanation.exampleSentence());
    }

    public static Explanation toExplanation(ExplanationDTO explanationDTO) {
        return new Explanation(explanationDTO.partOfSpeech(), explanationDTO.meaning(), explanationDTO.exampleSentence());
    }
}
