package org.lxz.wordpocket.infrastructure.database.implement;

import java.util.List;
import org.lxz.wordpocket.application.service.repository.VocabularyRepository;
import org.lxz.wordpocket.domain.model.Language;
import org.lxz.wordpocket.domain.model.PartOfSpeech;
import org.lxz.wordpocket.domain.model.Vocabulary;
import org.lxz.wordpocket.infrastructure.database.dao.VocabularyDAO;
import org.lxz.wordpocket.infrastructure.database.dto.VocabularyDTO;
import org.springframework.stereotype.Repository;

@Repository
public class VocabularyRepositoryImplement implements VocabularyRepository {

  private final VocabularyDAO vocabularyDAO;

  public VocabularyRepositoryImplement(VocabularyDAO vocabularyDAO) {
    this.vocabularyDAO = vocabularyDAO;
  }

  @Override
  public Vocabulary save(Vocabulary vocabulary) {
    return vocabularyDAO.save(VocabularyDTO.toVocabularyDTO(vocabulary)).toVocabulary();
  }

  @Override
  public List<Vocabulary> findAll() {
    return vocabularyDAO.findAll().stream()
        .map(VocabularyDTO::toVocabulary)
        .toList();
  }

  @Override
  public Vocabulary findByWord(String word) {
    return vocabularyDAO.findByWord(word).toVocabulary();
  }

  @Override
  public List<Vocabulary> findByLanguage(Language language) {
    return vocabularyDAO.findAll().stream()
        .map(VocabularyDTO::toVocabulary)
        .filter(vocabulary -> vocabulary.getProperties().getLanguage().equals(language))
        .toList();
  }

  @Override
  public List<Vocabulary> findByTag(String tag) {
    return vocabularyDAO.findAll().stream()
        .map(VocabularyDTO::toVocabulary)
        .filter(vocabulary -> vocabulary.getProperties().getTags().contains(tag))
        .toList();
  }

  @Override
  public List<Vocabulary> findByPartOfSpeech(PartOfSpeech partOfSpeech) {
    return vocabularyDAO.findAll().stream()
        .map(VocabularyDTO::toVocabulary)
        .filter(vocabulary -> vocabulary.getProperties().getExplanations().stream()
            .anyMatch(explanation -> explanation.getPartOfSpeech() == partOfSpeech))
        .toList();
  }

  @Override
  public List<Vocabulary> findByMeaning(String meaning) {
    return vocabularyDAO.findAll().stream()
        .map(VocabularyDTO::toVocabulary)
        .filter(vocabulary -> vocabulary.getProperties().getExplanations().stream()
            .anyMatch(explanation -> explanation.getMeaning().equals(meaning)))
        .toList();
  }

  @Override
  public List<Vocabulary> findByLanguageAndTag(Language language, String tag) {
    return vocabularyDAO.findAll().stream()
        .map(VocabularyDTO::toVocabulary)
        .filter(vocabulary -> vocabulary.getProperties().getLanguage().equals(language))
        .filter(vocabulary -> vocabulary.getProperties().getTags().contains(tag))
        .toList();
  }

  @Override
  public List<Vocabulary> findByLanguageAndPartOfSpeech(Language language,
      PartOfSpeech partOfSpeech) {
    return vocabularyDAO.findAll().stream()
        .map(VocabularyDTO::toVocabulary)
        .filter(vocabulary -> vocabulary.getProperties().getLanguage().equals(language))
        .filter(vocabulary -> vocabulary.getProperties().getExplanations().stream()
            .anyMatch(explanation -> explanation.getPartOfSpeech() == partOfSpeech))
        .toList();
  }

  @Override
  public List<Vocabulary> findByLanguageAndMeaning(Language language, String meaning) {
    return vocabularyDAO.findAll().stream()
        .map(VocabularyDTO::toVocabulary)
        .filter(vocabulary -> vocabulary.getProperties().getLanguage().equals(language))
        .filter(vocabulary -> vocabulary.getProperties().getExplanations().stream()
            .anyMatch(explanation -> explanation.getMeaning().equals(meaning)))
        .toList();
  }

  @Override
  public Vocabulary modifyByWord(Vocabulary vocabulary) {
    VocabularyDTO existing = vocabularyDAO.findByWord(vocabulary.getWord());
    if (existing == null) {
      return null;
    }
    vocabularyDAO.save(VocabularyDTO.toVocabularyDTO(vocabulary));
    return vocabulary;
  }

  @Override
  public void delete(String word) {
    vocabularyDAO.deleteByWord(word);
  }
}
