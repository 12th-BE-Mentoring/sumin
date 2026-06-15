package com.example.me_01;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PhoneNumber {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    public PhoneNumber(){
    }

    public String getName(){

        return name;
    }

    public void printPhoneNumber(){
        System.out.println(phoneNumber);
    }


}