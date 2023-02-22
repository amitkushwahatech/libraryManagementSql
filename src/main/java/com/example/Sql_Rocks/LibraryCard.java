package com.example.Sql_Rocks;


import jakarta.persistence.*;

@Entity
@Table(name = "library_card")
public class LibraryCard{
    @Id
    private  int cardNo;

    private int fine;

    private  int bookIssued;

    @Enumerated(value=EnumType.STRING)  // To store the values in db in String Format
    private CardStatus cardStatus;


    //child class  will have the foreign key of the parent class :
    //through which
    // it connects to other table
    @OneToOne  // mapping relation between two event
    @JoinColumn  //you are telling and a foregin key column --> degine the
    // column name of the parent class by default its primary key of parent class
    User user;
}
