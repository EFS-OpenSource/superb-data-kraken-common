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

import com.efs.sdk.common.domain.model.Capability;
import com.efs.sdk.common.domain.model.Confidentiality;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

/**
 * A data transfer object (DTO) which is used for handling space resources
 * This includes:
 * - storage resources
 * - iam resources
 * - opensearch resources
 */
@Validated
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpaceContextDTO {

    /**
     * The name of the space.
     * Must consist of lowercase letters, digits, and hyphens only, and be between 3 and 63 characters long.
     */
    @Schema(description = "The name of the space.", required = true)
    @Pattern(regexp = "[a-z0-9-]{3,63}") // sdk internal constraint on space name
    private String name;

    /**
     * The level of confidentiality for the space.
     * This can be PUBLIC, INTERNAL, or PRIVATE.
     */
    @Schema(description = "The level of confidentiality for the space.", example = "INTERNAL")
    private Confidentiality confidentiality;

    /**
     * The organization to which the space belongs.
     */
    @Schema(description = "The organization to which the space belongs.")
    @NotNull(message = "An associated organization must be defined for the space.")
    @Valid
    private OrganizationContextDTO organization;

    @Schema(description = "lists the capabilities of the space")
    private List<Capability> capabilities = new ArrayList<>();

}
