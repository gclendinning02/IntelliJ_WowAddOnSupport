package org.gclendinning02.library

import org.squarecell.wow.addon_support.wizard_steps.ui_components.AddOnConfigPanel
import kotlin.test.Test
import kotlin.test.assertNotNull

class LibraryTest {
    @Test fun mockTest() {
        val panel = AddOnConfigPanel();
        assertNotNull(panel)
    }
}