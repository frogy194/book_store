package pl.coderslab.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.bookstore.dao.PropositionDao;
import pl.coderslab.bookstore.entity.Book;
import pl.coderslab.bookstore.validation.BookProposition;

import java.util.List;

@Controller
@RequestMapping("/proposition")
public class PropositionController {
    @Autowired
    private PropositionDao propositionDao;

    @GetMapping("/addformv")
    public String addBookFormValidated(Model model) {
        Book b = new Book();
        model.addAttribute("proposition", b);

        return "proposition/addFormValidated";
    }

    @PostMapping("/addformv")
    public String addBookFormValidatedPost(@Validated({BookProposition.class}) Book proposition,
                                           BindingResult result, Model m) {
        if (result.hasErrors()) {
            m.addAttribute("proposition", proposition);
            return "proposition/addFormValidated";
        }
        // if validation passed
        proposition.setProposition(true);
        this.propositionDao.create(proposition);

        return "redirect:list";
    }

    @GetMapping("/list")
    public String list(){
        return "proposition/list";
    }

    @ModelAttribute("propositions")
    public List<Book> books(){
        return this.propositionDao.readAll();
    }
}
