package com.example.hackerlanguaje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.TextView)

        val inputText = "Hola, que tal?"

        val leetTable = mapOf(
            'a' to '4', 'b' to '8', 'e' to '3', 'g' to '9', 'l' to '1',
            'o' to '0', 's' to '5', 't' to '7', 'z' to '2', 'A' to '4',
            'B' to '8', 'E' to '3', 'G' to '9', 'L' to '1', 'O' to '0',
            'S' to '5', 'T' to '7', 'Z' to '2', '1' to '!', '3' to 'E',
            '4' to 'A', '5' to 'S', '7' to 'T', '8' to 'B', '9' to 'G',
            '0' to 'O'
        )

        val leetText = transformToLeet(inputText, leetTable)
        textView.text = leetText
    }

    private fun transformToLeet(input: String?, leetTable: Map<Char, Char>): String {
        if (input.isNullOrEmpty()) return ""

        val result = StringBuilder() //to build concatenated Strings without use "+"
        for (char in input) {
            val leetChar = leetTable[char] ?: char
            result.append(leetChar)
        }
        return result.toString()
    }
}