
package com.version1;

public class Customer {

    private static String name;
    private int accountNumber;

    private String status;
    private char 2;





    private String Customerinfo;



    public static void main(String[] args) {
        Customer myObj = new Customer(name);
        System.out.println(myObj.getName());
    }
    public Customer(String name)
    {
        this.name = name;



    }

    public String getName()
    {
        return name;
    }


    //
    // The getAccountNumber method returns the accountNumber
    //
    public int getAccountNumber()
    {
        return accountNumber;
    }






    //
    // ToDo:
    //
    // Provide a isHeld method that returns a boolean: true if the customer is status 'H' for on-hold,
    // otherwise it returns false
    //




    //
    // This changeDetails method changes the name
    //
    public void changeDetails(String name)
    {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerinfo() {
        return Customerinfo;
    }

    public void setCustomerinfo(String customerinfo) {
        Customerinfo = customerinfo;
    }


//
// ToDo:
//
// Provide a second changeDetails method that changes the name and status
//



//
// ToDo:
//
// Provide a class method, setLastUsedAccountNumber(), to reset the class variable
//
