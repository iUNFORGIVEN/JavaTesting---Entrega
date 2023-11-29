package org.example;

public class Discipline {
  private int id;
  private String name;
  private String slug;
  private String description;

  // Constructor
  public Discipline(int id, String name, String slug, String description) {
    this.id = id;
    this.name = name;
    this.slug = slug;
    this.description = description;
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

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public int addDiscipline(Discipline discipline) {

    return discipline.getId();
  }


  public void delete() {

  }


  public void save() {

  }
}
