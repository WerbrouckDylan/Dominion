package engine;

public enum AbilityEnum {
    Smithy,Cellar,Moat, Chancellor, Woodcutter,Chapel, Village,Workshop,Bureaucrat,Feast,Gardens,Militia,Moneylender,Remodel,Spy,Thief,ThroneRoom,CouncilRoom,Festival,Laboratory,Library,Market,Mine,Witch,Adventurer;

    public static void doShit(AbilityEnum ability, Player speler){
        switch (ability){
            case Cellar:
                doCellar(speler);
                break;
            case Chapel:
                doChapel(speler);
                break;
            case Moat:
                doMoat(speler);
                break;
            case Chancellor:
                doChancellor(speler);
                break;
            case Village:
                doVillage(speler);
                break;
            case Woodcutter:
                doWoodcutter(speler);
                break;
            case Workshop:
                doWorkshop(speler);
                break;
            case Bureaucrat:
                doBureaucrat(speler);
                break;
            case Feast:
                doFeast(speler);
                break;
            case Gardens:
                doGardens(speler);
                break;
            case Militia:
                doMilitia(speler);
                break;
            case Moneylender:
                doMoneylender(speler);
                break;
            case Remodel:
                doRemodel(speler);
                break;
            case Smithy:
                doSmithy(speler);
                break;
            case Spy:
                doSpy(speler);
                break;
            case Thief:
                doThief(speler);
                break;
            case ThroneRoom:
                doThroneRoom(speler);
                break;
            case CouncilRoom:
                doCouncilRoom(speler);
                break;
            case Festival:
                doFestival(speler);
                break;
            case Laboratory:
                doLaboratory(speler);
                break;
            case Library:
                doLibrary(speler);
                break;
            case Market:
                doMarket(speler);
                break;
            case Mine:
                doMine(speler);
                break;
            case Witch:
                doWitch(speler);
                break;
            case Adventurer:
                doAdventurer(speler);
                break;
        }
    }

    private static void doCellar(Player speler) {
        speler.setActions(1);
    }
    private static void doChapel(Player speler) {

    }
    private static void doMoat(Player speler) {
        speler.takeCardsFromDeck(2);
    }
    private static void doChancellor(Player speler) {
        speler.setCoins(2);
    }
    private static void doVillage(Player speler) {
        speler.takeCardsFromDeck(1);
    }
    private static void doWoodcutter(Player speler) {
        speler.setBuys(1);
        speler.setCoins(2);
    }
    private static void doWorkshop(Player speler) {

    }
    private static void doBureaucrat(Player speler) {

    }
    private static void doFeast(Player speler) {

    }
    private static void doGardens(Player speler) {
        for(int i = 0; i < speler.getSpelerDeck().size(); i += 10){         //// TODO: 28-4-2016  dit moet enkel itereren per 10 kaarten in de stack spelerdeck
            speler.setVictorypoints(1);
        }
    }
    private static void doMilitia(Player speler) {

    }
    private static void doMoneylender(Player speler) {

    }
    private static void doRemodel(Player speler) {

    }
    private static void doSmithy(Player speler) {
        speler.takeCardsFromDeck(3);
    }
    private static void doSpy(Player speler) {
        speler.takeCardsFromDeck(1);
    }
    private static void doThief(Player speler) {

    }
    private static void doThroneRoom(Player speler) {

    }
    private static void doCouncilRoom(Player speler) {
        speler.setBuys(1);
        speler.takeCardsFromDeck(4);
    }
    private static void doFestival(Player speler) {
        speler.setBuys(1);
    }
    private static void doLaboratory(Player speler) {
        speler.takeCardsFromDeck(2);
    }
    private static void doLibrary(Player speler) {

    }
    private static void doMarket(Player speler) {
        speler.setBuys(1);
        speler.takeCardsFromDeck(1);
    }
    private static void doMine(Player speler) {

    }
    private static void doWitch(Player speler) {
        speler.takeCardsFromDeck(2);
    }
    private static void doAdventurer(Player speler) {

    }
}
