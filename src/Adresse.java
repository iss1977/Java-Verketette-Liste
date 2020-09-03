class Adresse {
    public String stadt;
    public String strasse;
    public String hausnummer;
    public String text_description;

    public Adresse( Adresse toInsert){
        this.text_description = "";
        this.stadt=toInsert.stadt;
        this.strasse=toInsert.strasse;
        this.hausnummer=toInsert.hausnummer;
    }

    public Adresse( String  stadt, String strasse, String hausnummer){
        this.text_description = "";
        this.stadt=stadt;
        this.strasse=strasse;
        this.hausnummer=hausnummer;
    }



    @Override
    public String toString() {
        if (this == null)
            return "";
        //return (this.strasse+this.hausnummer+this.stadt);

        final StringBuilder sb = new StringBuilder("Adresse{");
        sb.append("stadt='").append(stadt).append('\'');
        sb.append(", strasse='").append(strasse).append('\'');
        sb.append(", hausnummer='").append(hausnummer).append('\'');
        sb.append(", text_description='").append(text_description).append('\'');
        sb.append('}');
        return (sb.toString());

    }
}
