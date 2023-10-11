package org.learnofficial.budgets.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String username;

  public User(String username) {
    this.username = username;
  }
}
