@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
    
    assertEquals("Должно вернуться true, так как пользователю больше 18 лет", expected, isAdult);
}
