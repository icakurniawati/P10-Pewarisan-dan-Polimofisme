public class Person {
    protected String name;
    protected String address;

    /**
     * Default constructor
    */

    public Person(){
        System.out.println("Inside Person : Constructor");
    name = "";
    address="";
    }

    /**
    *   Constructor dengan dua parameter 
    */
    public Person (String vname, String vaddress){
        this.name = vname;
        this.address = vaddress;
    }

    /**
    *   method accessor  
    method untuk mengenai variable atribut sebuah class
    */

    public String getName() {

        return name;

    }

    public String getAddress() {
         return address;
        
    }

    public void setName(String vname) {
        this.name = vname;
    }

    public void setAddres(String vaddress) {
        this.name = vaddress;
    }
}