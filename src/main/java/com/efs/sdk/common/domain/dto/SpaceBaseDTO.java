/*
Copyright (C) 2023 e:fs TechHub GmbH (sdk@efs-techhub.com)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.efs.sdk.common.domain.dto;

import com.efs.sdk.common.domain.model.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Pattern;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO class with attributes common to all Space DTOs
 */
@Validated
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SpaceBaseDTO {
    @Schema(description = "List of application configurations.")
    private List<AppConfiguration> appConfigs = new ArrayList<>();
    @Schema(description = "lists the capabilities of the space")
    private List<Capability> capabilities = new ArrayList<>();
    @Schema(description = "confidentiality of the space - one of PUBLIC, INTERNAL or PRIVATE.", example = "INTERNAL")
    private Confidentiality confidentiality;
    @Schema(description = "how many days must data be kept in storage", example = "365")
    private int defaultRetentionTime;
    @Schema(description = "description of the space")
    private String description;
    @Schema(description = "Reference to extended description, e.g. markdown-file.")
    private String descriptionRef;
    @Schema(description = "Display-Name of the space.")
    private String displayName;
    @Schema(description = "Marks, whether the space contains personal data, defaults to false.", example = "false")
    @Builder.Default
    private boolean gdprRelevant = false;
    @Schema(description = "identifier of the space")
    private String identifier;
    @Schema(description = "indicates, whether generation of metadata should be enabled. Default: false", example = "false")
    @Builder.Default
    private Boolean metadataGenerate = Boolean.FALSE;
    @Schema(description = "Name of the metadata-index.")
    private String metadataIndexName;
    @Schema(description = "Last time of modification.")
    private ZonedDateTime modified;
    /**
     * The name of the space.
     * Must consist of lowercase letters, digits, and hyphens only, and be between 3 and 63 characters long.
     */
    @Schema(description = "The name of the space.")
    @Pattern(regexp = "^[a-z0-9-]{3,63}$") // sdk internal constraint on space name
    private String name;
    @Schema(description = "Reference to the metadata-Schema.")
    private String schemaRef;
    @Schema(description = "state of the space - one of OPEN, CLOSED or LOCKED, defaults to &quot;OPEN&quot;.", example = "OPEN")
    @Builder.Default
    private State state = State.OPEN;
    @Schema(description = "tags to describe the space.")
    private List<Tag> tags = new ArrayList<>();
}
