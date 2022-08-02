package phones;

public class Phone {
     String brand ; // brand is instance variable
    private static String OWNER = "Jack" ; // OWNER is class variable ,it is static
    Phone (String brandParam){ // brandPram is local variable
        this.brand = brandParam; 

    }

     void call(String phoneNumber) {  //phoneNumber is local variable
        System.out.println(Phone.OWNER + "is Callling "+phoneNumber +"with")+this.brand);
    }


}
