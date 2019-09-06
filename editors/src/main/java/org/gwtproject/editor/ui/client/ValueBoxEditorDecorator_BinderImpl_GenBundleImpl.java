/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.gwtproject.editor.ui.client;

import org.gwtproject.resources.client.ResourcePrototype;

public class ValueBoxEditorDecorator_BinderImpl_GenBundleImpl
    implements ValueBoxEditorDecorator_BinderImpl_GenBundle {
  private static ValueBoxEditorDecorator_BinderImpl_GenBundleImpl _instance0 =
      new ValueBoxEditorDecorator_BinderImpl_GenBundleImpl();

  private void styleInitializer() {
    style =
        new ValueBoxEditorDecorator_BinderImpl_GenCss_style() {
          public String getName() {
            return "style";
          }

          private boolean injected;

          public boolean ensureInjected() {
            if (!injected) {
              injected = true;
              org.gwtproject.dom.client.StyleInjector.inject(getText());
              return true;
            }
            return false;
          }

          public String getText() {
            return (".J0US64B-a-a{display:inline}.J0US64B-a-b{display:none;white-space:pre}");
          }

          public String contents() {
            return "J0US64B-a-a";
          }

          public String errorLabel() {
            return "J0US64B-a-b";
          }
        };
  }

  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }

    static ValueBoxEditorDecorator_BinderImpl_GenCss_style get() {
      return style;
    }
  }

  public ValueBoxEditorDecorator_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }

  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static ValueBoxEditorDecorator_BinderImpl_GenCss_style style;

  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(),
    };
  }

  public ResourcePrototype getResource(String name) {
    if (resourceMap == null) {
      resourceMap = new java.util.HashMap<String, ResourcePrototype>();
      resourceMap.put("style", style());
    }
    return resourceMap.get(name);
  }
}
