public class Person {


    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings = new Person[0];

    /**

     * @param firstname 
     * @param lastname 
     * @param birthDay 
     * @param birthMonth 
     * @param birthYear 
     * @param ssn 
     */
    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;

    }

    //methods

    /**

     * @return 
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
    
     * @return
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
   
     * @param firstname 
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
   
     * @param lastname 
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**

     * @return 
     */
    public String getBirthday() {
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    /**

     * @param sibling 
     */
    public void addSibling(Person sibling) {
 
        Person[] newSiblings = new Person[this.numberOfSiblings + 1];


        for (int i = 0; i < this.numberOfSiblings; i++) {
            newSiblings[i] = this.siblings[i];
        }


        newSiblings[this.numberOfSiblings] = sibling;


        this.siblings = newSiblings;

        this.numberOfSiblings++;
    }

    /**

     * @return 
     */
    public Person[] getSiblings() {
        return this.siblings;
    }

}