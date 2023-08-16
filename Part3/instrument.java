abstract class instrument {

  abstract void play();

  String what() {
    return "instrument";
  }

  abstract void adjust();
}

class wind extends instrument {

  void play() {
    System.out.println("wind instrument played");
  }

  String what() {
    return "Wind";
  }

  void adjust() {
    System.out.println("Instrument tuned properly");
  }
}

class Percussion extends instrument {

  void play() {
    System.out.println("percussion instrument played");
  }

  String what() {
    return "Percussion";
  }

  void adjust() {
    System.out.println("Instrument tuned properly");
  }
}

class Stringed extends instrument {

  void play() {
    System.out.println("Stringed instrument played");
  }

  String what() {
    return "Stringed";
  }

  void adjust() {
    System.out.println("Instrument tuned properly");
  }
}

class Woodwind extends wind {

  void play() {
    System.out.println("Woodwind instrument played");
  }

  String what() {
    return "Woodwind";
  }
}

class Brass extends wind {

  void play() {
    System.out.println("Brass instrument played");
  }

  String what() {
    return "Brass";
  }
}
