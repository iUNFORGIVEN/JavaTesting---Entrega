import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class InterviewerTest {
  static String existingInterviewerName = "First";
  static String existingInterviewerLastName = "User";
  static String existingInterviewerEmail = "first@email.com";

  @BeforeEach
  public void setUp() throws Exception {
    Interviewer.data = new ArrayList<>();

    // We insert a user for testing delete and save
    Interviewer.data.add(new Interviewer(
            existingInterviewerName,
            existingInterviewerLastName,
            existingInterviewerEmail,
            true
    ));
  }

  @Test
  public void add() {
    Interviewer interviewer = new Interviewer(
            "Test",
            "User",
            "any@email.com",
            true
    );

    interviewer.add();

    int expectedId = Interviewer.data.size();
    assertEquals(
            expectedId,
            interviewer.id,
            "Interviewer ID should be the new List's size"
    );
  }


  @Test
  public void save() {
    int originalListSize = Interviewer.data.size();
    String expectedLastName = "New";
    Interviewer existingInterviewer = Interviewer.data.get(0);
    System.out.println(Interviewer.data.size());
    existingInterviewer.save("", expectedLastName, "", true);

    int newListSize = Interviewer.data.size();
    System.out.println(Interviewer.data.size());
    int lastInterviewerIndex = newListSize - 1;
    Interviewer latestInterviewer = Interviewer.data.get(lastInterviewerIndex);

    assertEquals(
            originalListSize,
            newListSize,
            "List size should be the same"
    );
    assertEquals(
            expectedLastName,
            latestInterviewer.lastName,
            "Last Name should have been updated"
    );
    assertEquals(
            existingInterviewer.name,
            latestInterviewer.name,
            "Name should have not been updated"
    );
  }

  @Test
  public void getByEmail() {
    Interviewer result = Interviewer.getByEmail(existingInterviewerEmail);

    assertNotNull(result, "Interviewer should be found");
    assertEquals(
            existingInterviewerName,
            result.name,
            "Unexpected Interviewer Name"
    );
    assertEquals(
            existingInterviewerLastName,
            result.lastName,
            "Unexpected Interviewer Last Name"
    );
  }

  @Test
  public void getByNonExistingEmail() {
    String nonExistingEmail = "nonexisting@email.com";

    Interviewer result = Interviewer.getByEmail(nonExistingEmail);

    assertNull(result, "Interviewer should not be found");
  }

  @Test
  public void delete() {
    Interviewer existingInterviewer = Interviewer.data.get(0);

    int expectedSize = Interviewer.data.size() - 1;

    try {
      existingInterviewer.delete();
    } catch (Exception e) {
      fail("Unexpected Exception received: " + e.getMessage());
    }

    int actualSize = Interviewer.data.size();

    assertEquals(
            expectedSize,
            actualSize,
            "List should be smaller"
    );
  }
}

/*
 4 PostWork
Durante el reto 1 creamos los casos de uso y sus especificaciones par acumplir con la historia de usuario: añadir entrevistadores
En tu archivo de pruebas añade las pruebas correspondientes para validar que se cumplan los criterios de aceptación
Modifica el código de alta de entrevistadores de ser necesario
Repetir los pasos 2 y 3 hasta que todos los criterios de aceptación sean validados con al menos una prueba y todas sus pruebas pasen.
 */



  private ArrayList<Interviewer> initialData;

  @BeforeMethod
  public void setUp() {
    Interviewer.data = new ArrayList<>();
    initialData = new ArrayList<>(); 
    initialData.addAll(Interviewer.data);
  }

  @Test
  public void testAddInterviewer() {
    Interviewer interviewer = new Interviewer("John", "Doe", "john@example.com", true);
    Interviewer addedInterviewer = interviewer.add();

    Assert.assertNotNull(addedInterviewer);
    Assert.assertEquals(Interviewer.data.size(), initialData.size() + 1);
    Assert.assertTrue(Interviewer.data.contains(addedInterviewer));
  }

  @Test(dependsOnMethods = "testAddInterviewer")
  public void testDeleteInterviewer() throws Exception {
    Interviewer interviewer = new Interviewer("Jane", "Smith", "jane@example.com", true);
    interviewer.add();

    int initialSize = Interviewer.data.size();
    interviewer.delete();

    Assert.assertEquals(Interviewer.data.size(), initialSize - 1);
    Assert.assertFalse(Interviewer.data.contains(interviewer));
  }

  @Test(dependsOnMethods = "testAddInterviewer")
  public void testGetByEmail() {
    Interviewer interviewer = new Interviewer("Alice", "Johnson", "alice@example.com", true);
    interviewer.add();

    Interviewer retrievedInterviewer = Interviewer.getByEmail("alice@example.com");

    Assert.assertNotNull(retrievedInterviewer);
    Assert.assertEquals(retrievedInterviewer.getEmail(), interviewer.getEmail());
  }
}