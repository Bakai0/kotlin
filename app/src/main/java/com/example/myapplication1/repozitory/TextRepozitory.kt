package com.example.myapplication1.repozitory

import com.example.myapplication1.TextModel

class TextRepozitory {

    private var TextList = mutableListOf<TextModel>()

    fun getListOfText(): MutableList<TextModel> {
        TextList.add(TextModel("Continue"))
        TextList.add(TextModel("Switching Protocols"))
        TextList.add(TextModel("Processing"))
        TextList.add(TextModel("Early Hints"))
        TextList.add(TextModel("OK"))
        TextList.add(TextModel("Created"))
        TextList.add(TextModel("Accepted"))
        TextList.add(TextModel("Non-Authoritative Information"))
        TextList.add(TextModel("No Content"))
        TextList.add(TextModel("Partial Content"))
        TextList.add(TextModel("Multi-Status"))
        TextList.add(TextModel("Multiple Choices"))
        TextList.add(TextModel("Moved Permanently"))

        return TextList
    }
}