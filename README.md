# 3.3.a.homework-local-instance-class.variables
# Requirement
1. Create a class named "Phone" in a "phones" package.
2. Add a class field named "brand", data type is String.
3. Add a constructor to your class. Constructor should have a String parameter to initialize the class field "brand".
4. Add a static class field named "OWNER", data type is String, initial value is "Jack".
5. Add a method named "call" in your "Phone" class, method should have one parameter named "phoneNumber", data type is String. Method should not return any value, but should print out "XXX is Calling YYY with ZZZ" where "XXX" represents the value of the "OWNER" field, "YYY" represents the value of "phoneNumber" parameter and "ZZZ" represents the value of the "brand" field.
6. Do you have local variable in your class? If yes, what is the name?
7. Do you have instance variable in your class? If yes, what is the name?
8. Do you have class variable in your class? If yes, what is the name?
9. Create a new class named "PhoneTester" in your "phones" package.
10. Add "main" method to your "PhoneTester" class as following, and explain why the line 9 and line 10 prints out "Tom" as the owner, instead of "Jack": 
```
public static void main(String[] args) {
    Phone iPhone = new Phone("iPhone");
    Phone android = new Phone("android");
    Phone.OWNER = "Tom";
    iPhone.call("123-456-7890");
    android.call("987-654-3210");
}
```