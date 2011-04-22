/*
 * Copyright (c) 2010 Two Ten Consulting Limited, New Zealand 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.concordion;

import org.concordion.api.extension.ConcordionExtension;
import org.concordion.api.extension.ConcordionExtensionFactory;
import org.concordion.ext.EmbedExtension;
import org.concordion.ext.ScreenshotExtension;
import org.concordion.internal.ConcordionBuilder;

public class EmbedExtensionWithConcordionNamespaceFactory implements ConcordionExtensionFactory {
    @Override
    public ConcordionExtension createExtension() {
        EmbedExtension extension = new EmbedExtension();
        extension.withNamespace("concordion", ConcordionBuilder.NAMESPACE_CONCORDION_2007);
        extension.withNamespace("cx", ScreenshotExtension.EXTENSION_NAMESPACE);
        return extension;
    }
}
