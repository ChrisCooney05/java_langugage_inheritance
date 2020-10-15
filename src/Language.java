class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in "+ this.regionsSpoken + ". The language follows the word order: " + this.wordOrder+ ".");
    }


    public static void main(String[] args){

        Language language = new Language("Spanish", 10, "Most", "test");
        language.getInfo();

        Mayan mayan = new Mayan("Chontal", 20);
        mayan.getInfo();

        SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 30);
        chinese.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 40);
        burmese.getInfo();
    }
}