public class Country {
  // add private instance variables for the name, capital, language, and image
  // file.
  private String name;
  private String capital;
  private String language;
  private String imageFile;

  // add constructors
public country(String couName, String couCaptial, String conLan, String couImg){
  name = couName;
  capital = couCaptial;
  language = conLan;
  imageFile = couImg;
}

  // Write accessor/get methods for each instance variable that returns it.
  public String getName() {
    return name;
  }

  public String getCapital() {
    return capital;
  }

  public String getLan() {
    return language;
  }

  public String getImage() {
    return imageFile;
  }

  // Write a toString() method that returns a concatenated String of 3 of the
  // instance variables in a sentence like "..'s capital is .. and its primary
  // language is ..."
  public String toString() {
    String combinedString;
    combinedString = name + "'s capital is " + capital + " and the people there speak " + language;
    return combinedString;
  }

}