public enum Kyrgyzstan {
    BATKEN("Batken = Aigul gul"),OSH("OSH = Sulaiman TOO"),JALAL_ABAT("Jalal abat = ArlanBab,Sary-Chelek"),
    YSSYK_KOL("Yssyk kol = Yssyk-Kol"),NARYN("Naryn = Naryn dariasy"),TALAS("Talas = Manas"),
    CHUI("Chui = Kyrgyzstandyn borboru Bishkek");
    private String ozgocho;

    public String getOzgocho() {
        return ozgocho;
    }

    public void setOzgocho(String ozgocho) {
        this.ozgocho = ozgocho;
    }

    Kyrgyzstan(String ozgocho) {
        this.ozgocho = ozgocho;
    }

    @Override
    public String toString() {
        return "Kyrgyzstan{"+ozgocho +
                '}';
    }
}

