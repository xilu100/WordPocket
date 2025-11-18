package org.lxz.wordpocket.infrastructure.database.dto;

import org.lxz.wordpocket.domain.model.Picture;

public record PictureDTO(String name, String url) {
    public static PictureDTO toPictureDTO(Picture picture) {
        return new PictureDTO(picture.name(), picture.url());
    }
    public static Picture toPicture(PictureDTO pictureDTO) {
        return new Picture(pictureDTO.name(), pictureDTO.url());
    }
}
