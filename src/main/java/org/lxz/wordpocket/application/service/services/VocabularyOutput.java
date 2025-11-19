package org.lxz.wordpocket.application.service.services;

import java.util.List;
import org.lxz.wordpocket.application.service.repository.VocabularyRepository;
import org.lxz.wordpocket.domain.model.Vocabulary;
import org.springframework.stereotype.Service;

@Service
public class VocabularyOutput {

  private final VocabularyRepository vocabularyRepository;

  public VocabularyOutput(VocabularyRepository vocabularyRepository) {
    this.vocabularyRepository = vocabularyRepository;
  }

  public List<Vocabulary> getVocabulary() {
    return vocabularyRepository.findAll();
  }

  public List<WordAndMeaning> getWordAndMeanings() {
    List<Vocabulary> vocabularies = getVocabulary();
    return vocabularies.stream()
        .map(vocabulary -> new WordAndMeaning(vocabulary.getWord(),
            vocabulary.getProperties().getExplanations().getFirst().getMeaning()))
        .toList();
  }
}
