package dev.linblackberry.flashcardapp.repository;

import java.util.List;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

import dev.linblackberry.flashcardapp.model.Category;
import dev.linblackberry.flashcardapp.model.Flashcard;

public interface FlashcardRepository extends CosmosRepository<Flashcard, Long> {
    List<Flashcard> findByCategory(Category category);
}
