package com.skcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.domain.book.Book;
import com.skcc.domain.user.User;

public interface BookRepository extends JpaRepository<Book, Long>{
}
