public enum AbilityEnum {
    SMITHY,FESTIVAL;

    public static void doShit(AbilityEnum ability){
        switch (ability){
            case SMITHY:
                doSmithy();
             break;
        }

    }

    private static void doSmithy() {
        System.out.println("Smithy done");
    }
}
