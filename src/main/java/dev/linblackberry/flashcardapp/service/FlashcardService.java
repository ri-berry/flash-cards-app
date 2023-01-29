package dev.linblackberry.flashcardapp.service;

import dev.linblackberry.flashcardapp.model.Category;
import dev.linblackberry.flashcardapp.model.Flashcard;
import dev.linblackberry.flashcardapp.repository.FlashcardRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FlashcardService {
    private FlashcardRepository flashcardRepo;

    public FlashcardService(FlashcardRepository flashcardRepo) {
        flashcardRepo = flashcardRepo;
    }

    public Optional<Flashcard> getFlashcard(long id) {
        return flashcardRepo.findById(id);  //.blockOptional(); // ???
    }

    public List<Flashcard> getFlashcardsByCategory(Category category) {
        List<Flashcard> flashcards = new ArrayList<>();
        flashcardRepo.findByCategory(category).forEach(flashcards::add);
        return flashcards;
    }

    public List<Flashcard> getAllFlashcards() {
        List<Flashcard> flashcards = new ArrayList<>();
        flashcardRepo.findAll().forEach(flashcards::add);
        return flashcards;
    }
}
