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
package com.efs.sdk.common.domain.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AppConfiguration {

    @Schema(description = "The display name of the app configuration.")
    private String displayName;

    @Schema(description = "The type of the app configuration.", implementation = AppConfigurationType.class)
    @NotNull
    private AppConfigurationType appType;

    @Schema(description = "The app path to link to.")
    private String path;

    public enum AppConfigurationType {
        SEARCH, UPLOAD, DASHBOARD
    }
}


