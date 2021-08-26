package com.example.kmpapp.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kmpapp.Greeting
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kmpapp.BookRepository
import com.example.kmpapp.android.databinding.ActivityMainBinding

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    private lateinit var bookAdapter: BookAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        bookAdapter = BookAdapter()
        val decoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        val booksList = BookRepository().fetchBooks()

        binding.listRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = bookAdapter
            addItemDecoration(decoration)
        }
        bookAdapter.setBooksList(booksList)
        setContentView(binding.root)
    }
}
