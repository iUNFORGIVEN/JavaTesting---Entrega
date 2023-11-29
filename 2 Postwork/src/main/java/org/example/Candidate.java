package org.example;

public class Candidate {
  private int id;
  private String name;
  private String lastName;
  private String email;
  private boolean isActive;

  // Constructor
  public Candidate(int id, String name, String lastName, String email, boolean isActive) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.isActive = isActive;
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }


  public int addCandidate(Candidate candidate) {

    return candidate.getId();
  }


  public void delete() {

  }

  public void save() {

  }


  public Candidate getByEmail(String email) {

    if (this.email.equals(email)) {
      return this;
    }
    return null;
  }
}
