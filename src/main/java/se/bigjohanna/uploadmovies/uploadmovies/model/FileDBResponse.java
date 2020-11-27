package se.bigjohanna.uploadmovies.uploadmovies.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class FileDBResponse {
    private String name;
    private String url;
    private String type;
    private long size;
}
