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

import com.efs.sdk.common.domain.model.Confidentiality;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Pattern;

/**
 * A data transfer object (DTO) for an organization, which is used for handling organization resources
 * This includes:
 * - iam resources
 * - storage resources
 * - opensearch resources
 */
@Validated
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrganizationContextDTO {

    /**
     * The unique identifier of the organization.
     */
    @Schema(description = "The ID of the organization.")
    private Long id;

    /**
     * The name of the organization.
     * Must consist of lowercase letters and digits only, and be between 3 and 24 characters long.
     */
    @Schema(description = "The name of the organization.", example = "organization", required = true)
    @Pattern(regexp = "^[a-z0-9]{3,24}$") // sdk internal constraint on the organization name
    private String name;

    /**
     * A brief description of the organization.
     */
    @Schema(description = "A description of the organization.", example = "description")
    private String description;

    /**
     * The level of confidentiality for the organization.
     * This can be PUBLIC, INTERNAL, or PRIVATE.
     */
    @Schema(description = "The confidentiality level of the organization.", example = "INTERNAL")
    private Confidentiality confidentiality;

}
