package com.javalibraryapi.JavaLibraryApi.Application.Services;

import com.javalibraryapi.JavaLibraryApi.Application.Services.Interfaces.IBookService;
import com.javalibraryapi.JavaLibraryApi.Infrastructure.Repositories.Interfaces.IBookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {

    private final IBookRepository _bookRepository;
    public BookService(IBookRepository bookRepository) {
        _bookRepository = bookRepository;
    }


}
