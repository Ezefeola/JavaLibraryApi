package com.javalibraryapi.JavaLibraryApi.Infrastructure.Repositories.Interfaces;

import com.javalibraryapi.JavaLibraryApi.Domain.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
