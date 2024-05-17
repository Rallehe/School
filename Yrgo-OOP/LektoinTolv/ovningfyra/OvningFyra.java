package ovningfyra;

public class OvningFyra {

    private static void someThing() throws MyOwnException{
        throw new MyOwnException("You done goofed");
    }

    private static void someThingElse() {
        try {
            someThing();
        }
        catch(MyOwnException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        someThingElse();
    }
}
