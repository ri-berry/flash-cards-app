package dev.linblackberry.flashcardapp.controller;

import dev.linblackberry.flashcardapp.model.Category;
import dev.linblackberry.flashcardapp.service.FlashcardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FlashcardController {

    private FlashcardService flashcardService;

    public FlashcardController(FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }

    @GetMapping("/")
    public String toIndex(Model model) {
        model.addAttribute("categories", Category.values());
        return "index";
    }

    @GetMapping("/{category}")
    public String toCategory(@PathVariable String category, Model model) {
        model.addAttribute("category", category);
        model.addAttribute("flashcards", this.flashcardService.getFlashcardsByCategory(Category.valueOf(category)));
        System.out.println(model.getAttribute("flashcards"));
        return "flashcard-list";
    }

    @GetMapping("/all")
    public String toCategory(Model model) {
        model.addAttribute("flashcards", this.flashcardService.getAllFlashcards());
        System.out.println(model.getAttribute("flashcards"));
        return "flashcard-list";
    }
}
