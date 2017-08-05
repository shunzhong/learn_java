package michael.jta.atomikos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户存款
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
@Entity
@Table(name = "tb_account")
public class BankAccount implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2177992568468527776L;

    private int id;
    private String userName;
    private float deposit;

    /**
     * @return the id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue
    public int getId() {
        return id;
    }

    /**
     * @return the userName
     */
    @Column(name = "user_name", length = 20)
    public String getUserName() {
        return userName;
    }

    /**
     * @return the deposit
     */
    @Column(name = "deposit")
    public float getDeposit() {
        return deposit;
    }

    /**
     * @param pId the id to set
     */
    public void setId(int pId) {
        id = pId;
    }

    /**
     * @param pUserName the userName to set
     */
    public void setUserName(String pUserName) {
        userName = pUserName;
    }

    /**
     * @param pDeposit the deposit to set
     */
    public void setDeposit(float pDeposit) {
        deposit = pDeposit;
    }

}
