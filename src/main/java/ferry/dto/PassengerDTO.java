/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferry.dto;

import java.io.Serializable;

/**
 *
 * @author Jon
 */
public class PassengerDTO extends AbstractAccount implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String cprNo;
    private String name;
    private String sex;
    private int age;

    public PassengerDTO(long id)
    {
        super(id);
    }

    public PassengerDTO(String cprNo, String name, String sex, int age, long id)
    {
        super(id);
        this.cprNo = cprNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getCprNo()
    {
        return cprNo;
    }

    public void setCprNo(String cprNo)
    {
        this.cprNo = cprNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
