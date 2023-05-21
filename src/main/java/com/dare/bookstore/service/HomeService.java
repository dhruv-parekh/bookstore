package com.dare.bookstore.service;

import com.dare.bookstore.model.Inquiry;
import com.dare.bookstore.service.model.Author;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {


    public List<Author> getAllAuthors() {
        List<Author> list = new ArrayList<>();
        Author author1 = new Author(1, "Dhruv", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBxaFNEFZrcA3vNdKIIjYxPMXIImwZiIoN3Q&usqp=CAU", "Description1");
        Author author2 = new Author(2, "Raghav", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTujne8yZvCIrYnurmYJyoMCgkdN8kd8GUMng&usqp=CAU", "Description2");
        Author author3 = new Author(3, "Rmana", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcwl9qKTKqrGJJYsfFloLXEyDbmh3Zx674zw&usqp=CAU", "Description2");

        list.add(author1);
        list.add(author2);
        list.add(author3);
        return list;

    }

    public List<Author> SearchAuthors(String searchInquiry) {
        List<Author> list = new ArrayList<>();
        Author author1 = new Author(1, "Dhruv", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBxaFNEFZrcA3vNdKIIjYxPMXIImwZiIoN3Q&usqp=CAU", "Description1");
        Author author2 = new Author(2, "Raghav", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTujne8yZvCIrYnurmYJyoMCgkdN8kd8GUMng&usqp=CAU", "Description2");
        Author author3 = new Author(3, "Rmana", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcwl9qKTKqrGJJYsfFloLXEyDbmh3Zx674zw&usqp=CAU", "Description2");
        Author author4 = new Author(4, "Dhruv", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBxaFNEFZrcA3vNdKIIjYxPMXIImwZiIoN3Q&usqp=CAU", "Description1");
        list.add(author1);
        list.add(author2);
        list.add(author3);
        list.add(author4);

        List<Author> searchAuthorslist = new ArrayList<>();
        for (Author a:list) {
            if(a.getName().equalsIgnoreCase(searchInquiry)) searchAuthorslist.add(a);
        }

        return searchAuthorslist;


    }
}
