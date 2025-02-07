package com.javalibraryapi.JavaLibraryApi.Domain.Models;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="Categories")
public class Category extends BaseModel {
    private String Name;

    @OneToMany(mappedBy = "Category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> Books;
}
