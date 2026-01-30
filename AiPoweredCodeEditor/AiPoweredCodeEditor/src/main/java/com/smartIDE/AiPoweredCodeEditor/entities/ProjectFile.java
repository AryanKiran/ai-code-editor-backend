package com.smartIDE.AiPoweredCodeEditor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {

    @Id
    Long id;

    Project project;

    String path;

    String minioObjectKey;

    Instant createdAt;

    Instant updatedAt;

    User createdBy;

    User updatedBy;

}
