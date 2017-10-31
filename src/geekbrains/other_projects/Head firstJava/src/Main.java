 class EchoTestDrive {
    public static void main (String [] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
          if (x == 3) {
                e2.count = e2.count + 1;
          }
          if (x > 0) {
              e2.count = e2.count + e1.count;
          }
          x = x + 1;
        }
        System.out.println(e2.count);
    }

}

class Echo {
    int count = 0;

    void hello()  {
        System.out.println("Привеееееттт......");
    }
}


/* class DrumKit {
    boolean topHat = true; // объявляем две логические переменные
    boolean share = true;

    void playToHat() {
        System.out.println("динь динь ди-динь");
    }
    void playShare() {
        System.out.println("Бах бах ба-бах");
    }
}

class DrumKitTestDrive {
    public static void main(String [] args) {

        DrumKit d = new DrumKit();

        d.playShare();
        d.share = false;
        d.playToHat();

        if (d.share == true) {
            d.playShare();
        }
    }
} */