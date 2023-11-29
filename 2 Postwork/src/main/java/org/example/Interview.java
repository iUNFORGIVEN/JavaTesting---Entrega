package org.example;

public class Interview {
  private int id;
  private Candidate candidate;
  private Interviewer interviewer;
  private InterviewType type;
  private Technology technology;
  private Discipline discipline;


  public Interview(int id, Candidate candidate, Interviewer interviewer, InterviewType type,
                   Technology technology, Discipline discipline) {
    this.id = id;
    this.candidate = candidate;
    this.interviewer = interviewer;
    this.type = type;
    this.technology = technology;
    this.discipline = discipline;
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Candidate getCandidate() {
    return candidate;
  }

  public void setCandidate(Candidate candidate) {
    this.candidate = candidate;
  }

  public Interviewer getInterviewer() {
    return interviewer;
  }

  public void setInterviewer(Interviewer interviewer) {
    this.interviewer = interviewer;
  }

  public InterviewType getType() {
    return type;
  }

  public void setType(InterviewType type) {
    this.type = type;
  }

  public Technology getTechnology() {
    return technology;
  }

  public void setTechnology(Technology technology) {
    this.technology = technology;
  }

  public Discipline getDiscipline() {
    return discipline;
  }

  public void setDiscipline(Discipline discipline) {
    this.discipline = discipline;
  }


  public int addInterview(Interview interview) {

    return interview.getId();
  }


  public void delete() {

  }

  public void save() {

  }
}
