package com.example.kmpapp.android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kmpapp.Book
import com.example.kmpapp.android.databinding.RowBookNameBinding

class BookAdapter : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    var books: MutableList<Book> = mutableListOf()

    private lateinit var binding: RowBookNameBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        binding = RowBookNameBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return BookViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book: Book = books[position]
        holder.bind(book)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    fun setBooksList(newBooksList: List<Book>) {
        books.clear()
        books.addAll(newBooksList)
        notifyDataSetChanged()
    }

    class BookViewHolder(private val binding: RowBookNameBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Book) {
            binding.bookName.text = book.name
            binding.bookDescription.text = book.description
            binding.bookAuthor.text = book.author
        }
    }
}