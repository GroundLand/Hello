package importJAVASE.Thread;

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }

    protected void diposed() {
        System.out.println("disposeing Character " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }

    protected void diposed() {
        System.out.println("disposeing Description " + s);
    }
}

class LivingCreature {
    private Characteristic p = new Characteristic("is  alive");
    private Description t = new Description("Basic Living Creature");

    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void diposed() {
        System.out.println("LivingCreature dispose");
    }
}

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");

    Animal() {
        System.out.println("Animal()");
    }

    protected void diposed() {
        System.out.println("Animal dispose");
        t.diposed();
        p.diposed();
        super.diposed();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose() {
        System.out.println("Amphibian dispose");
        t.diposed();
        p.diposed();
        super.diposed();
    }
}

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("Frog dispose");
        t.diposed();
        p.diposed();
        super.dispose();
    }

    public static void main(String args[]) {
        Frog frog = new Frog();
        System.out.println("Bye!");
        frog.dispose();
    }
}
