package com.olvind

case object DomNode    extends DomType("")
case object DomElement extends DomType("FromHtml")

case object DomTableCell extends DomType("FromHtml") {
  override val props = super.props ++
    Seq(
      ParsedProp(
        PropName("colspan"),
        baseType = Normal("Int"),
        commentOpt = Some(
          PropComment(
            "Specifies the number of columns a cell should span"))
      ),
      ParsedProp(
        PropName("rowspan"),
        baseType = Normal("Int"),
        commentOpt = Some(
          PropComment(
            "Sets the number of rows a cell should span"))
      )
    )
}

case object DomImg extends DomType(suffix = "FromHtml") {
  private val formTarget = com.olvind.Enum(CompName("Input"),
    Seq("_blank", "_self", "_parent", "_top", "framename"),
    "FormTarget")
  override val props = super.props ++
    Seq(
      ParsedProp(
        PropName("src"),
        baseType = Normal("String"),
        commentOpt = Some(
          PropComment(
            "Specifies the number of columns a cell should span"))
      ),
      ParsedProp(PropName("alt"),
        baseType = Normal("String"),
        commentOpt = Some(
          PropComment("Specifies an alternate text for images (only for type='image')"))),
      ParsedProp(PropName("crossorigin"),
        baseType = Normal("String"),
        commentOpt = Some(
          PropComment("Allow images from third-party sites that allow cross-origin access to be used with canvas"))),
      ParsedProp(
        PropName("formtarget"),
        baseType = formTarget,
        commentOpt = Some(PropComment(
          "Specifies where to display the response that is received after submitting the form (for type='submit' and type='image')"))
      ),
      ParsedProp(
        PropName("height"),
        baseType = Normal("Int"),
        commentOpt =
          Some(PropComment("Specifies the height of an <input> element (only for type='image')"))),
      ParsedProp(
        PropName("ismap"),
        baseType = Normal("Boolean"),
        commentOpt =
          Some(PropComment("Specifies an image as a server-side image-map"))),
      ParsedProp(
        PropName("longdesc"),
        baseType = Normal("String"),
        commentOpt =
          Some(PropComment("Specifies a URL to a detailed description of an image"))),
      ParsedProp(
        PropName("srcset"),
        baseType = Normal("String"),
        commentOpt =
          Some(PropComment("Specifies the URL of the image to use in different situations"))),
      ParsedProp(
        PropName("usemap"),
        baseType = Normal("String"),
        commentOpt =
          Some(PropComment("Specifies an image as a client side image map"))),
      ParsedProp(
        PropName("width"),
        baseType = Normal("Int"),
        commentOpt =
          Some(PropComment("Specifies the width of an image")))
    )
}

case object DomInput extends DomType("FromInput") {

  private val formMethodType =
    com.olvind.Enum(CompName("Input"), Seq("get", "post"), "FormMethodType")
  private val formTarget = com.olvind.Enum(CompName("Input"),
                                           Seq("_blank", "_self", "_parent", "_top", "framename"),
                                           "FormTarget")
  private val inputAutoComplete =
    com.olvind.Enum(CompName("Input"), Seq("on", "off"), "AutoComplete")
  private val inputType = com.olvind.Enum(
    CompName("Input"),
    Seq(
      "button",
      "checkbox",
      "color",
      "date",
      "datetime-local",
      "email",
      "file",
      "hidden",
      "image",
      "month",
      "number",
      "password",
      "radio",
      "range",
      "reset",
      "search",
      "submit",
      "tel",
      "text",
      "time",
      "url",
      "week"
    ),
    "InputType"
  )
  private val inputEncodingType = com.olvind.Enum(
    CompName("Input"),
    Seq("application/x-www-form-urlencoded", "multipart/form-data", "text/plain"),
    "InputEncodingType")

  override val props = super.props ++
    Seq(
      ParsedProp(
        PropName("accept"),
        baseType = Normal("String"),
        commentOpt = Some(
          PropComment(
            "Specifies the types of files that the server accepts (only for type='file')"))
      ),
      ParsedProp(PropName("alt"),
                 baseType = Normal("String"),
                 commentOpt = Some(
                   PropComment("Specifies an alternate text for images (only for type='image')"))),
      ParsedProp(
        PropName("autocomplete"),
        baseType = inputAutoComplete,
        commentOpt =
          Some(PropComment("Specifies whether an <input> element should have autocomplete enabled"))
      ),
      ParsedProp(
        PropName("autofocus"),
        baseType = Normal("Boolean"),
        commentOpt = Some(
          PropComment(
            "Specifies that an <input> element should automatically get focus when the page loads"))
      ),
      ParsedProp(
        PropName("checked"),
        baseType = Normal("Boolean"),
        commentOpt = Some(PropComment(
          "Specifies that an <input> element should be pre-selected when the page loads (for type='checkbox' or type='radio')"))
      ),
      ParsedProp(PropName("dirname"),
                 baseType = Normal("Boolean"),
                 commentOpt =
                   Some(PropComment("Specifies that the text direction will be submitted"))),
      ParsedProp(PropName("disabled"),
                 baseType = Normal("Boolean"),
                 commentOpt =
                   Some(PropComment("Specifies that an <input> element should be disabled"))),
      ParsedProp(PropName("form"),
                 baseType = Normal("String"),
                 commentOpt =
                   Some(PropComment("Specifies one or more forms the <input> element belongs to"))),
      ParsedProp(
        PropName("formaction"),
        baseType = Normal("String"),
        commentOpt = Some(PropComment(
          "Specifies the URL of the file that will process the input control when the form is submitted (for type='submit' and type='image')"))
      ),
      ParsedProp(
        PropName("formenctype"),
        baseType = inputEncodingType,
        commentOpt = Some(PropComment(
          "Specifies how the form-data should be encoded when submitting it to the server (for type='submit' and type='image')"))
      ),
      ParsedProp(
        PropName("formmethod"),
        baseType = formMethodType,
        commentOpt = Some(PropComment(
          "Defines the HTTP method for sending data to the action URL (for type='submit' and type='image')"))
      ),
      ParsedProp(
        PropName("formnovalidate"),
        baseType = Normal("Boolean"),
        commentOpt =
          Some(PropComment("Defines that form elements should not be validated when submitted"))
      ),
      ParsedProp(
        PropName("formtarget"),
        baseType = formTarget,
        commentOpt = Some(PropComment(
          "Specifies where to display the response that is received after submitting the form (for type='submit' and type='image')"))
      ),
      ParsedProp(
        PropName("height"),
        baseType = Normal("Int"),
        commentOpt =
          Some(PropComment("Specifies the height of an <input> element (only for type='image')"))),
      ParsedProp(
        PropName("list"),
        baseType = Normal("String"),
        commentOpt = Some(PropComment(
          "Refers to a <datalist> element that contains pre-defined options for an <input> element"))
      ),
      ParsedProp(PropName("max"),
                 baseType = Normal("Float | String"),
                 commentOpt =
                   Some(PropComment("Specifies the maximum value for an <input> element"))),
      ParsedProp(
        PropName("maxlength"),
        baseType = Normal("Int"),
        commentOpt = Some(
          PropComment("Specifies the maximum number of characters allowed in an <input> element"))),
      ParsedProp(
        PropName("min"),
        baseType = Normal("Float | String"),
        commentOpt = Some(PropComment("Specifies a minimum value for an <input> element"))),
      ParsedProp(
        PropName("multiple"),
        baseType = Normal("Boolean"),
        commentOpt = Some(
          PropComment("Specifies that a user can enter more than one value in an <input> element"))
      ),
      ParsedProp(PropName("name"),
                 baseType = Normal("String"),
                 commentOpt = Some(PropComment("Specifies the name of an <input> element"))),
      ParsedProp(
        PropName("pattern"),
        baseType = Normal("String"),
        commentOpt = Some(
          PropComment(
            "Specifies a regular expression that an <input> element's value is checked against"))
      ),
      ParsedProp(
        PropName("placeholder"),
        baseType = Normal("String"),
        commentOpt = Some(
          PropComment(
            "Specifies a short hint that describes the expected value of an <input> element"))
      ),
      ParsedProp(PropName("readonly"),
                 baseType = Normal("Boolean"),
                 commentOpt = Some(PropComment("Specifies that an input field is read-only"))),
      ParsedProp(
        PropName("required"),
        baseType = Normal("Boolean"),
        commentOpt = Some(
          PropComment(
            "Specifies that an input field must be filled out before submitting the form"))
      ),
      ParsedProp(PropName("size"),
                 baseType = Normal("Int"),
                 commentOpt =
                   Some(PropComment("Specifies the width; in characters; of an <input> element"))),
      ParsedProp(
        PropName("src"),
        baseType = Normal("String"),
        commentOpt = Some(
          PropComment(
            "Specifies the URL of the image to use as a submit button (only for type='image')"))
      ),
      ParsedProp(PropName("step"),
                 baseType = Normal("Float | String"),
                 commentOpt =
                   Some(PropComment("Specifies the legal number intervals for an input field"))),
      ParsedProp(PropName("type"),
                 baseType = inputType,
                 commentOpt = Some(PropComment("Specifies the type <input> element to display"))),
      ParsedProp(PropName("value"),
                 baseType = Normal("String"),
                 commentOpt = Some(PropComment("Specifies the value of an <input> element "))),
      ParsedProp(
        PropName("width"),
        baseType = Normal("Int"),
        commentOpt =
          Some(PropComment("Specifies the width of an <input> element (only for type='image')")))
    )
}
case object DomTextArea extends DomType("FromTextArea")

sealed abstract class DomType(val suffix: String) {
  def props: Seq[ParsedProp] = Seq(
    ParsedProp(
      PropName("contenteditable"),
      baseType = Normal("Boolean"),
      commentOpt =
        Some(PropComment("Specifies wheter the content of an element is editable or not"))),
    ParsedProp(
      PropName("contextmenu"),
      baseType = Normal("String"),
      commentOpt =
        Some(PropComment("SPecifies a context menu for an element, the context menu appears when a user right clicks on the element"))),
    ParsedProp(
      PropName("draggable"),
      baseType = Normal("Boolean"),
      commentOpt =
        Some(PropComment("Specifies whether an element is draggable or not"))),
    ParsedProp(
      PropName("dropzone"),
      baseType = Normal("String"),
      commentOpt =
        Some(PropComment("Specifies whether the dragged data is copied, moved or linked when dropped"))),
    ParsedProp(
      PropName("hidden"),
      baseType = Normal("Boolean"),
      commentOpt =
        Some(PropComment("Specifies that an element is not yet or is no longer relevant"))),
    ParsedProp(
      PropName("spellcheck"),
      baseType = Normal("Boolean"),
      commentOpt =
        Some(PropComment("Specifies whether the element is to have its spelling and grammar checked or not"))),
    ParsedProp(
      PropName("translate"),
      baseType = Normal("Boolean"),
      commentOpt =
        Some(PropComment("Specifies whether the content of an element should be translated or not"))),
    ParsedProp(
      PropName("dir"),
      baseType = Normal("String"),
      commentOpt =
        Some(PropComment("Specifies the text direction for the content in the element"))),
    ParsedProp(
      PropName("lang"),
      baseType = Normal("String"),
      commentOpt =
        Some(PropComment("Specifies the language of the element's content"))),
    ParsedProp(
      PropName("tabindex"),
      baseType = Normal("Int"),
      commentOpt =
        Some(PropComment("Specifies the tabbing order of an element")))
  )

  private def handler(name: String, param: String, commentOpt: Option[PropComment] = None): ParsedProp = {
    ParsedProp(
      name = PropName(name),
      isRequired = false,
      baseType = Normal(s"$param${suffix} => Callback"),
      commentOpt = commentOpt,
      deprecatedMsg = None,
      inheritedFrom = Some(CompName("DOM"))
    )
  }

  //Shamelessly taken from here: https://www.w3schools.com/tags/ref_eventattributes.asp
  val handlers: Seq[ParsedProp] =
    Seq(
      //Window Event Attributes
      handler("onAfterPrint", "ReactEvent", Some(PropComment("Script to be run after the document is printed"))),
      handler("onBeforePrint", "ReactEvent", Some(PropComment("Script to be run before the document is printed"))),
      handler("onBeforeUnload", "ReactEvent", Some(PropComment("Script to be run when the document is about to be unloaded"))),
      handler("onError", "ReactEvent", Some(PropComment("Script to be run when an error occurs"))),
      handler("onHashChange", "ReactEvent", Some(PropComment("Script to be run when there has been changes to the anchor part of the a URL"))),
      handler("onLoad", "ReactEvent", Some(PropComment("Fires after the page is finished loading"))),
      handler("onMessage", "ReactEvent", Some(PropComment("Script to be run when the message is triggered"))),
      handler("onOffline", "ReactEvent", Some(PropComment("Script to be run when the browser starts to work offline"))),
      handler("onOnline", "ReactEvent", Some(PropComment("Script to be run when the browser starts to work online"))),
      handler("onPageHide", "ReactEvent", Some(PropComment("Script to be run when a user navigates away from a page"))),
      handler("onPageShow", "ReactEvent", Some(PropComment("Script to be run when a user navigates to a page"))),
      handler("onPopState", "ReactEvent", Some(PropComment("Script to be run when the window's history changes"))),
      handler("onResize", "ReactEvent", Some(PropComment("Fires when the browser window is resized"))),
      handler("onStorage", "ReactEvent", Some(PropComment("Script to be run when a Web Storage area is updated"))),
      handler("onUnload", "ReactEvent", Some(PropComment("Fires once a page has unloaded (or the browser window has been closed)"))),

      //Form Events
      handler("onBlur", "ReactFocusEvent", Some(PropComment("Fires the moment that the element loses focus"))),
      handler("onChange", "ReactEvent", Some(PropComment("Fires the moment when the value of the element is changed"))),
      handler("onContextMenu", "ReactEvent", Some(PropComment("Script to be run when a context menu is triggered"))),
      handler("onFocus", "ReactFocusEvent", Some(PropComment("Fires the moment when the element gets focus"))),
      handler("onInput", "ReactKeyboardEvent", Some(PropComment("Script to be run when an element gets user input"))),
      handler("onInvalid", "ReactEvent", Some(PropComment("Script to be run when an element is invalid"))),
      handler("onReset", "ReactEvent", Some(PropComment("Fires when the Reset button in a form is clicked"))),
      handler("onSearch", "ReactEvent", Some(PropComment("Fires when the user writes something in a search field (for <input='search'>)"))),
      handler("onSelect", "ReactUIEvent", Some(PropComment("Fires after some text has been selected in an element"))),
      handler("onSubmit", "ReactEvent", Some(PropComment("Fires when a form is submitted"))),

      //Keyboard events
      handler("onKeyDown", "ReactKeyboardEvent", Some(PropComment("Fires when a user is pressing a key"))),
      handler("onKeyPress", "ReactKeyboardEvent", Some(PropComment("Fires when a user presses a key"))),
      handler("onKeyUp", "ReactKeyboardEvent", Some(PropComment("Fires when a user releases a key"))),

      //Mouse Events
      handler("onClick", "ReactMouseEvent", Some(PropComment("Fires on a mouse click on the element"))),
      handler("onDblClick", "ReactMouseEvent", Some(PropComment("Fires on a mouse double-click on the element"))),
      handler("onMouseDown", "ReactMouseEvent", Some(PropComment("Fires when a mouse button is pressed down on an element"))),
      handler("onMouseMove", "ReactMouseEvent", Some(PropComment("Fires when the mouse pointer is moving while it is over an element"))),
      handler("onMouseOut", "ReactMouseEvent", Some(PropComment("Fires when the mouse pointer moves out of an element"))),
      handler("onMouseOver", "ReactMouseEvent", Some(PropComment("Fires when the mouse pointer moves over an element"))),
      handler("onMouseUp", "ReactMouseEvent", Some(PropComment("Fires when a mouse button is released over an element"))),
      handler("onMouseVheel", "ReactWheelEvent", Some(PropComment("Deprecated. Use the onwheel attribute instead"))),
      handler("onWheel", "ReactWheelEvent", Some(PropComment("Fires when the mouse wheel rolls up or down over an element"))),

      //Drag Events
      handler("onDrag", "ReactDragEvent", Some(PropComment("Script to be run when an element is dragged"))),
      handler("onDragEnd", "ReactDragEvent", Some(PropComment("Script to be run at the end of a drag operation"))),
      handler("onDragEnter", "ReactDragEvent", Some(PropComment("Script to be run when an element has been dragged to a valid drop target"))),
      handler("onDragLeave", "ReactDragEvent", Some(PropComment("Script to be run when an element leaves a valid drop target"))),
      handler("onDragOver", "ReactDragEvent", Some(PropComment("Script to be run when an element is being dragged over a valid drop target"))),
      handler("onDragStart", "ReactDragEvent", Some(PropComment("Script to be run at the start of a drag operation"))),
      handler("onDrop", "ReactDragEvent", Some(PropComment("Script to be run when dragged element is being dropped"))),
      handler("onScroll", "ReactUIEvent", Some(PropComment("Script to be run when an element's scrollbar is being scrolled"))),

      //Clipboard Events
      handler("onCopy", "ReactClipboardEvent", Some(PropComment("Fires when the user copies the content of an element"))),
      handler("onCut", "ReactClipboardEvent", Some(PropComment("Fires when the user cuts the content of an element"))),
      handler("onPaste", "ReactClipboardEvent", Some(PropComment("Fires when the user pastes some content in an element"))),

      //Media Events
      handler("onAbort", "ReactEvent", Some(PropComment("Script to be run on abort"))),
      handler("onCanPlay", "ReactEvent", Some(PropComment("Script to be run when a file is ready to start playing (when it has buffered enough to begin)"))),
      handler("onCanPlayThrough", "ReactEvent", Some(PropComment("Script to be run when a file can be played all the way to the end without pausing for buffering"))),
      handler("onCueChange", "ReactEvent", Some(PropComment("Script to be run when the cue changes in a <track> element"))),
      handler("onDurationChange", "ReactEvent", Some(PropComment("Script to be run when the length of the media changes"))),
      handler("onEmptied", "ReactEvent", Some(PropComment("Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)"))),
      handler("onEnded", "ReactEvent", Some(PropComment("Script to be run when the media has reach the end (a useful event for messages like 'thanks for listening')"))),
      handler("onLoadedData", "ReactEvent", Some(PropComment("Script to be run when media data is loaded"))),
      handler("onLoadedMetadata", "ReactEvent", Some(PropComment("Script to be run when meta data (like dimensions and duration) are loaded"))),
      handler("onLoadStart", "ReactEvent", Some(PropComment("Script to be run just as the file begins to load before anything is actually loaded"))),
      handler("onPause", "ReactEvent", Some(PropComment("Script to be run when the media is paused either by the user or programmatically"))),
      handler("onPlay", "ReactEvent", Some(PropComment("Script to be run when the media is ready to start playing"))),
      handler("onPlaying", "ReactEvent", Some(PropComment("Script to be run when the media actually has started playing"))),
      handler("onProgress", "ReactEvent", Some(PropComment("Script to be run when the browser is in the process of getting the media data"))),
      handler("onRateChange", "ReactEvent", Some(PropComment("Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode)"))),
      handler("onSeeked", "ReactEvent", Some(PropComment("Script to be run when the seeking attribute is set to false indicating that seeking has ended"))),
      handler("onSeeking", "ReactEvent", Some(PropComment("Script to be run when the seeking attribute is set to true indicating that seeking is active"))),
      handler("onStalled", "ReactEvent", Some(PropComment("Script to be run when the browser is unable to fetch the media data for whatever reason"))),
      handler("onSuspend", "ReactEvent", Some(PropComment("Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason"))),
      handler("onTimeUpdate", "ReactEvent", Some(PropComment("Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)"))),
      handler("onVolumeChange", "ReactEvent", Some(PropComment("Script to be run each time the volume is changed which (includes setting the volume to 'mute')"))),
      handler("onWaiting", "ReactEvent", Some(PropComment("Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)"))),

      //Misc Events
      handler("onShow", "ReactEvent", Some(PropComment("Fires when a <menu> element is shown as a context menu"))),
      handler("onToggle", "ReactEvent", Some(PropComment("Fires when the user opens or closes the <details> element"))),

      //This are not in w3schools list, I'm not sure where they're coming from
      handler("onAnimationEnd", "ReactEvent"),
      handler("onAnimationIteration", "ReactEvent"),
      handler("onAnimationStart", "ReactEvent"),
      handler("onCompositionEnd", "ReactCompositionEvent"),
      handler("onCompositionStart", "ReactCompositionEvent"),
      handler("onCompositionUpdate", "ReactCompositionEvent"),
      handler("onTouchCancel", "ReactTouchEvent"),
      handler("onTouchEnd", "ReactTouchEvent"),
      handler("onTouchMove", "ReactTouchEvent"),
      handler("onTouchStart", "ReactTouchEvent"),
      handler("onTransitionEnd", "ReactTouchEvent")
    )
}
