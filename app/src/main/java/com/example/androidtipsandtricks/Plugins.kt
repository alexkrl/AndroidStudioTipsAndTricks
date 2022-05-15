package com.example.androidtipsandtricks

class Plugins {

    class Plugin(val name: String, val description: String)

    val usefulPlugins = listOf(
        Plugin(
            "Adb Idea",
            "Tool included with the Android SDK that allows you to communicate with and debug Android devices"
        ),
        Plugin(
            "KeyPromoter",
            "The Key Promoter X helps you to learn essential shortcuts while you are working"
        ), // distraction - big window
        Plugin(
            "KeyPromoter X",
            "The Key Promoter X helps you to learn essential shortcuts while you are working"
        ), // small window
        Plugin(
            "String Manipulation",
            "Case switching, sorting, filtering, incrementing, aligning to columns, grepping, escaping, encoding..."
        )
    )
}