package org.lxz.wordpocket.application.service.repository;

import java.util.List;
import java.util.Set;
import org.lxz.wordpocket.domain.model.Language;
import org.lxz.wordpocket.domain.model.PartOfSpeech;
import org.lxz.wordpocket.domain.model.Vocabulary;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyRepository {

  /*
  Create
   */
  Vocabulary save(Vocabulary vocabulary);

  /*
   Read
   */
  List<Vocabulary> findAll();

  Vocabulary findByWord(String word);

  List<Vocabulary> findByLanguage(Language language);

  List<Vocabulary> findByTag(String tag);

  List<Vocabulary> findByPartOfSpeech(PartOfSpeech partOfSpeech);

  List<Vocabulary> findByMeaning(String meaning);

  // Language + XXX
  List<Vocabulary> findByLanguageAndTag(Language language, String tag);

  List<Vocabulary> findByLanguageAndPartOfSpeech(Language language, PartOfSpeech partOfSpeech);

  List<Vocabulary> findByLanguageAndMeaning(Language language, String meaning);

    /*
     Update&Modify
     */

  Vocabulary modifyByWord(Vocabulary vocabulary);

  /*
   Delete&Remove
   */
  void delete(String word);
}
