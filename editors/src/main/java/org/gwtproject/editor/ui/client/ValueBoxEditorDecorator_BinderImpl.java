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

import org.gwtproject.dom.client.DivElement;
import org.gwtproject.dom.client.Document;
import org.gwtproject.dom.client.Element;
import org.gwtproject.safehtml.client.SafeHtmlTemplates;
import org.gwtproject.safehtml.shared.SafeHtml;
import org.gwtproject.uibinder.client.LazyDomElement;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiBinderUtil;
import org.gwtproject.user.client.ui.HTMLPanel;
import org.gwtproject.user.client.ui.SimplePanel;
import org.gwtproject.user.client.ui.Widget;

@javax.annotation.Generated(
    value = "org.gwtproject.uibinder.processor.UiBinderProcessor",
    date = "2019-09-06T16:40:25.652")
public class ValueBoxEditorDecorator_BinderImpl
    implements UiBinder<Widget, ValueBoxEditorDecorator<?>>, ValueBoxEditorDecorator.Binder {

  interface Template extends SafeHtmlTemplates {
    // @Template("<div class='{0}' id='{1}'></div> <span id='{2}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2);
  }

  Template template = new ValueBoxEditorDecorator_BinderImpl_TemplateImpl();

  public Widget createAndBindUi(final ValueBoxEditorDecorator owner) {

    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /** Encapsulates the access to all inner widgets */
  class Widgets {
    private final ValueBoxEditorDecorator owner;

    public Widgets(final ValueBoxEditorDecorator owner) {
      this.owner = owner;
      build_style(); // generated css resource must be always created. Type: GENERATED_CSS.
      // Precedence: 1
      build_domId0(); // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1(); // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1Element(); // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1("" + get_style().errorLabel() + "", get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times.
     * Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ValueBoxEditorDecorator_BinderImpl_GenBundle
        get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }

    private ValueBoxEditorDecorator_BinderImpl_GenBundle
        build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ValueBoxEditorDecorator_BinderImpl_GenBundle
          clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay =
              (ValueBoxEditorDecorator_BinderImpl_GenBundle)
                  new ValueBoxEditorDecorator_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /** Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1. */
    private ValueBoxEditorDecorator_BinderImpl_GenCss_style style;

    private ValueBoxEditorDecorator_BinderImpl_GenCss_style get_style() {
      return style;
    }

    private ValueBoxEditorDecorator_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /** Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1. */
    private HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }

    private HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final HTMLPanel f_HTMLPanel1 = new HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ =
            UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_errorLabel();
        get_domId1Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_contents(), get_domId1Element().get());

      return f_HTMLPanel1;
    }

    /** Getter for errorLabel called 1 times. Type: DEFAULT. Build precedence: 2. */
    private Element get_errorLabel() {
      return build_errorLabel();
    }

    private Element build_errorLabel() {
      // Creation section.
      final DivElement errorLabel = new LazyDomElement(get_domId0()).get().cast();
      // Setup section.

      this.owner.errorLabel = errorLabel;

      return errorLabel;
    }

    /** Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2. */
    private String domId0;

    private String get_domId0() {
      return domId0;
    }

    private String build_domId0() {
      // Creation section.
      domId0 = Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /** Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2. */
    private String domId1;

    private String get_domId1() {
      return domId1;
    }

    private String build_domId1() {
      // Creation section.
      domId1 = Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /** Getter for contents called 1 times. Type: DEFAULT. Build precedence: 2. */
    private SimplePanel get_contents() {
      return build_contents();
    }

    private SimplePanel build_contents() {
      // Creation section.
      final SimplePanel contents = new SimplePanel();
      // Setup section.
      contents.setStylePrimaryName("" + get_style().contents() + "");

      this.owner.contents = contents;

      return contents;
    }

    /** Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2. */
    private org.gwtproject.uibinder.client.LazyDomElement domId1Element;

    private org.gwtproject.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }

    private org.gwtproject.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }
  }
}
