package br.com.ikematsu.repository

import br.com.ikematsu.model.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Long>