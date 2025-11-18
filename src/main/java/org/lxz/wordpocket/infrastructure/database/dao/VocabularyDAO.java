package org.lxz.wordpocket.infrastructure.database.dao;

import org.lxz.wordpocket.domain.model.Language;
import org.lxz.wordpocket.domain.model.Vocabulary;
import org.lxz.wordpocket.infrastructure.database.dto.VocabularyDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VocabularyDAO extends CrudRepository<VocabularyDTO, Long> {
    List<VocabularyDTO> findAll();
    VocabularyDTO findById(long id);
    VocabularyDTO findByWord(String word);
}
