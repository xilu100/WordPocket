package org.lxz.wordpocket.domain.model;

/**
 * @param partOfSpeech    词性（n，adj，v...）
 * @param meaning         翻译
 * @param exampleSentence 例句
 */
public record Explanation(PartOfSpeech partOfSpeech, String meaning, String exampleSentence) {
}
