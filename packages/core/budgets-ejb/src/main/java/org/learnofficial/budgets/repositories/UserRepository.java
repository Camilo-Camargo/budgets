package org.learnofficial.budgets.repositories;

import org.learnofficial.budgets.models.*;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@ApplicationScoped
public class UserRepository {

  @PersistenceContext
  private EntityManager em;

  public User findById(Long id) {
    return em.find(User.class, id);
  }

  public void create(User user) {
    em.persist(user);
  }
}
