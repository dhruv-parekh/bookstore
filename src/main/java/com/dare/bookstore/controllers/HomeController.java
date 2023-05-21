package com.dare.bookstore.controllers;

import com.dare.bookstore.model.Inquiry;
import com.dare.bookstore.service.HomeService;
import com.dare.bookstore.service.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public  String getIndexPage(Model model){
        model.addAttribute("inquiry",new Inquiry());
        return "index";
    }

    @GetMapping("/about")
    public  String gotoAboutPage(){
        return "about";
    }

    @GetMapping("/book")
    public  String gotoBookPage(){
        return "book";
    }
    @GetMapping("/blog")
    public  String gotoBlogPage(){
        return "blog";
    }
    @GetMapping("/blogSingle")
    public  String gotoBlogSinglePage(){
        return "blogSingle";
    }
    @GetMapping("/comingSoon")
    public  String gotoComingSoonPage(){
        return "comingSoon";
    }
    @GetMapping("/contact")
    public  String gotoContactPage(){
        return "contact";
    }
    @GetMapping("/topSeller")
    public  String gotoTopSellerPage(){
        return "topSeller";
    }
    @GetMapping("/author")
    public String gotoMainPage(Model model){
      List<Author> authorList =  homeService.getAllAuthors();
      model.addAttribute("authors",authorList);
        return "author";
    }

    @PostMapping("/author")
    public String searchInquiry(Model model, @ModelAttribute Inquiry inquiry){
//        Inquiry inq= (Inquiry) model.getAttribute("inquiry");
        System.out.println(inquiry.getSearchInquiry());
        List<Author> inqList = homeService.SearchAuthors(inquiry.getSearchInquiry());
        model.addAttribute("authors",inqList);
        return "author";
    }
}
