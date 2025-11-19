package org.lxz.wordpocket.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

@Getter
@Setter
public class Picture {

  @Id
  private Long id;
  private String name;
  private String url;
  @PersistenceCreator
  public Picture(Long id,String name, String url) {
    this.id = id;
    this.name = name;
    this.url = url;
  }

}

