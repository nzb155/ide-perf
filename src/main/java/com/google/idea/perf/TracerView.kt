/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.idea.perf

import com.intellij.openapi.ui.MessageType
import com.intellij.openapi.ui.popup.util.PopupUtil
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBPanel
import com.intellij.util.textCompletion.TextFieldWithCompletion
import javax.swing.JProgressBar

/** The content for filling the tracer dialog window. */
abstract class TracerView: JBPanel<TracerView>() {
    abstract val commandLine: TextFieldWithCompletion
    abstract val progressBar: JProgressBar
    abstract val refreshTimeLabel: JBLabel

    fun showCommandBalloon(message: String, type: MessageType) {
        PopupUtil.showBalloonForComponent(commandLine, message, type, true, null)
    }
}
