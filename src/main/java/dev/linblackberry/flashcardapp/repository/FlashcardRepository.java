package dev.linblackberry.flashcardapp.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

import dev.linblackberry.flashcardapp.model.Category;
import dev.linblackberry.flashcardapp.model.Flashcard;

import java.util.List;

public interface FlashcardRepository extends CosmosRepository<Flashcard, Long> {
    List<Flashcard> findByCategory(Category category);
}
