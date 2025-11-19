package org.lxz.wordpocket.infrastructure.database.dto;

import org.lxz.wordpocket.domain.model.Picture;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("picture")
public record PictureDTO(@Id Long id, String name, String url) {

  public static PictureDTO toPictureDTO(Picture picture) {
    return new PictureDTO(picture.getId(), picture.getName(), picture.getUrl());
  }

  public Picture toPicture() {
    return new Picture(this.id,this.name, this.url);
  }
}
