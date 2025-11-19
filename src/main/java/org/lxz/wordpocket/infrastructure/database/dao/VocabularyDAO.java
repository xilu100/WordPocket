package org.lxz.wordpocket.infrastructure.database.dao;

import java.util.List;
import org.lxz.wordpocket.infrastructure.database.dto.VocabularyDTO;
import org.springframework.data.repository.CrudRepository;

public interface VocabularyDAO extends CrudRepository<VocabularyDTO, Long> {

  List<VocabularyDTO> findAll();

  VocabularyDTO findById(long id);

  VocabularyDTO findByWord(String word);

  VocabularyDTO deleteByWord(String word);
}
