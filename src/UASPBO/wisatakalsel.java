
package UASPBO;
//class
public class wisatakalsel {
    //atribut dan encapsulation
    public String kabupaten;
    
    
    //constructor
    public wisatakalsel(String kabupaten ) {
        this.kabupaten = kabupaten;
    }
    //mutator (setter)
    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }
    //accessor (getter)
    public String getKabupaten() {
        return kabupaten;
    }
    //polymorphim (overloading)
    public String hasil() {
        return "kabupaten: "+getKabupaten();
    }
}

