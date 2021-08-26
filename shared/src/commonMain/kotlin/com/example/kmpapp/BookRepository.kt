package com.example.kmpapp

class BookRepository {
    fun fetchBooks() = listOf(
        Book("In Search of Lost Time", "Swann's Way, the first part of A la recherche de temps perdu, Marcel Proust's seven-part cycle, was published in 1913.", "Marcel Proust"),
        Book("Ulysses", "Ulysses chronicles the passage of Leopold Bloom through Dublin during an ordinary day, June 16, 1904.", "James Joyce"),
        Book("Don Quixote", "Alonso Quixano, a retired country gentleman in his fifties, lives in an unnamed section of La Mancha with his niece and a housekeeper", "Miguel de Cervantes"),
        Book("One Hundred Years of Solitude", "One of the 20th century's enduring works, One Hundred Years of Solitude is a widely beloved and acclaimed novel known throughout the world", "Gabriel Garcia Marquez"),
        Book("The Great Gatsby", "The novel chronicles an era that Fitzgerald himself dubbed the \"Jazz Age\"", "F. Scott Fitzgerald"),
        Book("Moby Dick", "First published in 1851, Melville's masterpiece is, in Elizabeth Hardwick's words, \"the greatest novel in American literature.\"", "Herman Melville"),
        Book("War and Peace", "Epic in scale, War and Peace delineates in graphic detail events leading up to Napoleon's invasion of Russia", "Leo Tolstoy"),
        Book("Hamlet", "The Tragedy of Hamlet, Prince of Denmark, or more simply Hamlet, is a tragedy by William Shakespeare", "William Shakespeare"),
        Book("The Odyssey", "The Odyssey is one of two major ancient Greek epic poems attributed to Homer", "Homer"),
        Book("Madame Bovary", "For daring to peer into the heart of an adulteress and enumerate its contents with profound dispassion", "Gustave Flaubert")
    ).sortedBy(Book::name)
}