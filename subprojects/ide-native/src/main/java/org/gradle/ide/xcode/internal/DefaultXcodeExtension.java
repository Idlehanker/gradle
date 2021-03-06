/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.ide.xcode.internal;

import org.gradle.api.model.ObjectFactory;
import org.gradle.ide.xcode.XcodeExtension;

import javax.inject.Inject;

public class DefaultXcodeExtension implements XcodeExtension {
    private final DefaultXcodeProject project;
    private final DefaultXcodeWorkspace workspace;

    @Inject
    public DefaultXcodeExtension(ObjectFactory objectFactory) {
        project = objectFactory.newInstance(DefaultXcodeProject.class);
        workspace = objectFactory.newInstance(DefaultXcodeWorkspace.class);
    }

    @Override
    public DefaultXcodeProject getProject() {
        return project;
    }

    @Override
    public DefaultXcodeWorkspace getWorkspace() {
        return workspace;
    }
}
