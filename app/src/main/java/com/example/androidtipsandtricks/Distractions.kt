package com.example.androidtipsandtricks

open class Distractions {

    object TooManyMenus : Distractions(
        /**
         * Solution = To find anything use double shift
         * For example - Actions , Keymap reference, with number
         */
    )

    object Tabs : Distractions(
        /**
         * Solution = Remove them and navigate through Cmd+E/Double shift/control+tab
         * more about it in article of Hadi Hariri - https://hadihariri.com/2014/06/24/no-tabs-in-intellij-idea/
         * Always select opened files
         */
    )

    object BreadcrumbsAndNavigationBar : Distractions(
        /**
         * Solution = Remove both of them
         * shortcut : option+↖ (home)
         */
    )

    object LineNumbers : Distractions(
        /**
         * Solution = Remove them and use command+g
         * Line number and cursor position are appear in the bottom
         * Use double shift + ":line number"
         */
    )

    object Panels : Distractions(
        /**
         * Toggle with keys - command + numbers (shortcuts)
         * Shift+escape close last one
         * Distraction free mode - shift+option+dot (not there by default)
         */
    )
}