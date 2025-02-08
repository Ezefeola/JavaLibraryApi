package com.javalibraryapi.JavaLibraryApi.Application.Services.Interfaces;

import com.javalibraryapi.JavaLibraryApi.Domain.Models.Category;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface ICategoryService {
    public Category saveCategory(Category category);
//    public CompletableFuture<Category> saveCategory(Category category);
    public List<Category> getAllCategoriesAsync();
//    public CompletableFuture<List<Category>> getAllCategoriesAsync();
    public CompletableFuture<Optional<Category>> getCategoryByIdAsync(Long id);
    public Optional<Category> deleteCategory(Long id);
}
