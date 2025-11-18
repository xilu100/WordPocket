package org.lxz.wordpocket.infrastructure.database.dto;

import org.lxz.wordpocket.domain.model.Language;
import org.lxz.wordpocket.domain.model.Property;

import java.util.List;
import java.util.Set;

public record PropertyDTO(List<ExplanationDTO> explanations, Language language, Set<String> tags, String note) {
    public static PropertyDTO toPropertyDTO(Property property) {
        return new PropertyDTO(
                property.getExplanations()
                        .stream()
                        .map(ExplanationDTO::toExplanationDTO)
                        .toList(),
                property.getLanguage(),
                property.getTags(),
                property.getNote()
        );
    }
    public static Property toProperty(PropertyDTO propertyDTO) {
        return new Property(propertyDTO.explanations
                .stream()
                .map(ExplanationDTO::toExplanation)
                .toList(),
                propertyDTO.language,
                propertyDTO.tags,
                propertyDTO.note);
    }
}
