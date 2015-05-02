package com.eztracks

class User {


    String name
    String password
    String emailId
    String phoneNumber
    String phoneNumber1

    static constraints = {
        phoneNumber1 nullable: true
        emailId unique: true    

    }
}
