package com.matteonegri.subscription_tracker;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    private final SubscriptionRepository repository;

    public SubscriptionController(SubscriptionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Subscription> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Subscription add(@RequestBody Subscription subscription) {
        return repository.save(subscription);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}