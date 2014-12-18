package ferry.dto;

import java.io.Serializable;

/**
 *
 * @author Paul
 */
public class AccountDetail extends AbstractAccount implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private String cprNo;
    private String password;
    private String name;
    private String email;
    private String address;
    
    public AccountDetail(long id)
    {
        super(id);
    }
    
    public AccountDetail(long id, String cprNo, String password, String name, String email, String address)
    {
        super(id);
        this.cprNo = cprNo;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getCprNo() {
        return cprNo;
    }

    public void setCprNo(String cprNo) {
        this.cprNo = cprNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }    
    
}
