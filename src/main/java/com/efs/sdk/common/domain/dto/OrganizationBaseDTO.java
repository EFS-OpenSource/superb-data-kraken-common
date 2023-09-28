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

import com.efs.sdk.common.domain.model.AppConfiguration;
import com.efs.sdk.common.domain.model.Confidentiality;
import com.efs.sdk.common.domain.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO class with attributes common to all Organization DTOs
 */
@Validated
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class OrganizationBaseDTO {
    @Schema(description = "List of application configurations.")
    @Builder.Default
    private List<AppConfiguration> appConfigs = new ArrayList<>();
    @Schema(description = "company owning the organization.", example = "e:fs TechHub GmbH")
    private String company;
    @Schema(description = "The confidentiality level of the organization.", example = "INTERNAL", implementation = Confidentiality.class)
    private Confidentiality confidentiality;
    @Schema(description = "A description of the organization.", example = "description")
    private String description;
    @Schema(description = "Display-Name of the organization.")
    private String displayName;
    /**
     * The name of the organization.
     * Must consist of lowercase letters and digits only, and be between 3 and 24 characters long.
     */
    @Schema(description = "Name of the organization (must match the pattern '^[a-z0-9]{3,24}$').")
    @Pattern(regexp = "^[a-z0-9]{3,24}$")
    private String name;
    @Schema(description = "tags to describe the organization.")
    @Builder.Default
    private List<Tag> tags = new ArrayList<>();
}
