package com.example.androidtipsandtricks

val usefulKeys = mapOf(
    "Cmd+f1" to "show problem description", // click again expand/collapse description
    "f2" to "jump to warning",
    "Cmd+f12" to "show structure",
    "Opt+f12" to "open terminal",
    "Opt+Enter" to "context actions",
    "Opt+f7" to "show usages",
    "shift+f6" to "rename",
    "f6" to "move",
    "Cmd+f6" to "change signature",
    "Cmd+Option+Shift+T" to "open refactor menu",
    "Cmd+shift+arrows up/down" to "Move line/s inside scope",
    "Opt+shift+arrows up/down" to "Move line/s without scope",
    "Cmd+B" to "go to definition",
    "Shift+Cmd+I" to "show definition",
    "Cmd+Option+Arrow Left/Right" to "move back/forward",
    "Option+/" to "cycling word completion", // + Shift
    "Shift+Enter" to "new line",
    "Cmd+D" to "duplicate line",
    "Cmd+Y" to "delete line",
    "Option+Arrow left right" to "move caret by words ",
    "Cmd+W" to "extend selection",
    "Control+G" to "add selection for next occurrence", // + Control+Cmd+G for all
    "Shift+Command+v" to "paste from buffer",
    "Cmd+P" to "show params",
    "Control+Shift+P" to "show type of return",
    "Cmd+Option+v" to "extract to value",
    "Cmd+Option+m" to "extract to method",
    "Cmd+Option+p" to "extract to parameter",
    "Cmd+Option+n" to "inline",
    "Cmd+k" to "git commit",
    "Cmd+shift+k" to "git push",
    "Option+Cmd+z" to "revert changes/rollback",
    "shift+f10" to "run app",
    "shift+enter" to "split vertical",
    "Options+tab" to "switch between split tabs",
    "Cmd+f4" to "close current tab"
)

// Create your most used actions as shortcuts - for example
val createYourOwnShortCuts = mapOf(
    "Options+shift+d" to "attach to debugger",
    "shift+Option+v" to "git branches"
)

class ShortCuts {


    class PlayGround(secondVal: Int, firstVal: String) {

        class MoveMe

        val showUsages = usefulKeys
        val tempText = "Temp"


        val test = "tempText asd asd asd asd "
        val test2 = "tempText asd asd asd asd tempText"

        val duplicateMeAndThenDelete = "First duplicate and then delete"

        fun renameMe() {
            val temp = tempText
            val temp2 = tempText
        }

        fun cutAndPaste() {
            val retVal = 1
        }

        fun whatType() {
            2.toLong().toBigInteger().lowestSetBit.toChar().category
        }

        fun withParams(
            first: String,
            second: String,
        ) {
            val a = "duplicateMeasl;dka;sldkAndThenDelete"
        }
    }
}