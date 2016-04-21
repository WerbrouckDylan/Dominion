
public enum AbilityEnum {
    Cellar,Smithy,Festival,Moat;

    public static void doShit(AbilityEnum ability){
        switch (ability){
            case Smithy:
                doSmithy();
             break;
            case Cellar:
                doCellar();
        }

    }

    private static void doCellar() {
        System.out.println("Cellar done");
    }

    private static void doSmithy() {
        System.out.println("Smithy done");
    }
}
