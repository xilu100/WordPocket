package org.lxz.wordpocket.infrastructure.database.implement;

import org.lxz.wordpocket.application.service.repository.VocabularyRepository;
import org.lxz.wordpocket.domain.model.Language;
import org.lxz.wordpocket.domain.model.PartOfSpeech;
import org.lxz.wordpocket.domain.model.Vocabulary;
import org.lxz.wordpocket.infrastructure.database.dao.VocabularyDAO;

import java.util.List;
import java.util.Set;

public class VocabularyRepositoryImplement implements VocabularyRepository {
    private final VocabularyDAO vocabularyDAO;

    public VocabularyRepositoryImplement(VocabularyDAO vocabularyDAO) {
        this.vocabularyDAO = vocabularyDAO;
    }

    @Override
    public Vocabulary save(Vocabulary vocabulary) {
        return null;
    }

    @Override
    public List<Vocabulary> findAll() {
        return List.of();
    }

    @Override
    public Vocabulary findByWord(String word) {
        return null;
    }

    @Override
    public List<Vocabulary> findByLanguage(Language language) {
        return List.of();
    }

    @Override
    public List<Vocabulary> findByTag(String tag) {
        return List.of();
    }

    @Override
    public List<Vocabulary> findByPartOfSpeech(PartOfSpeech partOfSpeech) {
        return List.of();
    }

    @Override
    public List<Vocabulary> findByMeaning(String meaning) {
        return List.of();
    }

    @Override
    public List<Vocabulary> findByLanguageAndTag(Language language, Set<String> tags) {
        return List.of();
    }

    @Override
    public List<Vocabulary> findByLanguageAndPartOfSpeech(Language language, PartOfSpeech partOfSpeech) {
        return List.of();
    }

    @Override
    public List<Vocabulary> findByLanguageAndMeaning(Language language, String meaning) {
        return List.of();
    }

    @Override
    public Vocabulary modifyByWord(Vocabulary vocabulary) {
        return null;
    }

    @Override
    public void delete(String word) {

    }
}
