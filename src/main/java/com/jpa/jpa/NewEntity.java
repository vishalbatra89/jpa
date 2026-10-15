package com.jpa.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demotable")
public class NewEntity 
{
    
@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name="name")
private String name;
@Column(name="lastname")
private String lastname;
@Column(name="email", unique = true)
private String email;

public int getId() 
{
    return id;
}
public NewEntity() 
{
}
public NewEntity(String name, String lastname, String email) 
{
    //this.id = id;
    this.name = name;
    this.lastname = lastname;
    this.email = email;
}
public void setId(int id) 
{
    this.id = id;
}
public String getName() 
{
    return name;
}
public void setName(String name) 
{
    this.name = name;
}
public String getLastname() 
{
    return lastname;
}
public void setLastname(String lastname) 
{
    this.lastname = lastname;
}
public String getEmail() 
{
    return email;
}
public void setEmail(String email) 
{
    this.email = email;
}


}
