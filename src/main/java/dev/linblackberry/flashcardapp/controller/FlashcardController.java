package dev.linblackberry.flashcardapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlashcardController {

    @GetMapping("/")
    public String toIndex() {
        return "index";
    }

}
