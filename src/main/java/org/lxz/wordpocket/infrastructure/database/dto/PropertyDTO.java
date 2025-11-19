package org.lxz.wordpocket.infrastructure.database.dto;

import java.util.List;
import java.util.Set;
import org.lxz.wordpocket.domain.model.Language;
import org.lxz.wordpocket.domain.model.Property;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("property")
public record PropertyDTO(@Id Long id, List<ExplanationDTO> explanations, Language language,
                          Set<String> tags,
                          String note) {

  public static PropertyDTO toPropertyDTO(Property property) {
    return new PropertyDTO(
        property.getId(),
        property.getExplanations()
            .stream()
            .map(ExplanationDTO::toExplanationDTO)
            .toList(),
        property.getLanguage(),
        property.getTags(),
        property.getNote()
    );
  }

  public Property toProperty() {
    return new Property(this.id,
        this.explanations.stream().map(ExplanationDTO::toExplanation).toList(),
        this.language,
        this.tags,
        this.note);
  }
}
