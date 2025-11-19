package org.lxz.wordpocket.infrastructure.web.controller;

import java.util.List;
import org.lxz.wordpocket.application.service.services.VocabularyOutput;
import org.lxz.wordpocket.application.service.services.WordAndMeaning;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VocabularyController {

  private final VocabularyOutput vocabularyOutput;

  public VocabularyController(VocabularyOutput vocabularyOutput) {
    this.vocabularyOutput = vocabularyOutput;
  }
  @RequestMapping("/")
  public String index(Model model) {
    List<WordAndMeaning> wordAndMeanings = vocabularyOutput.getWordAndMeanings();
    model.addAttribute("wordAndMeanings", wordAndMeanings);
    return "index";
  }
}
