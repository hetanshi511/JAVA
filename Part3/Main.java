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

  void adjust() {
    System.out.println("Instrument tuned properly");
  }
}

class Brass extends wind {

  void play() {
    System.out.println("Brass instrument played");
  }

  void adjust() {
    System.out.println("Instrument tuned properly");
  }
}

class Main {

  public static void main(String[] args) {
    wind w1 = new wind();
    w1.play();
    System.out.println(w1.what());
    w1.adjust();
    Percussion p = new Percussion();
    p.play();
    System.out.println(p.what());
    p.adjust();
    Stringed s = new Stringed();
    s.play();
    System.out.println(s.what());
    s.adjust();
    Woodwind ww = new Woodwind();
    ww.play();
    ww.adjust();
    Brass b = new Brass();
    b.play();
    b.adjust();
  }
}
