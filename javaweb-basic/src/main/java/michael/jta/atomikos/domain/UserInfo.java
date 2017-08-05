package michael.jta.atomikos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
@Entity
@Table(name = "tb_user_info")
public class UserInfo implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3450307120572451762L;
    private String userName;
    private String realName;
    private String remark1;
    private String remark2;

    /**
     * @return the userName
     */
    @Id
    @Column(name = "user_name", length = 20)
    public String getUserName() {
        return userName;
    }

    /**
     * @return the realName
     */
    @Column(name = "real_name", length = 10)
    public String getRealName() {
        return realName;
    }

    /**
     * @return the remark1
     */
    @Column(name = "remark1", length = 50)
    public String getRemark1() {
        return remark1;
    }

    /**
     * @return the remark2
     */
    @Column(name = "remark2", length = 50)
    public String getRemark2() {
        return remark2;
    }

    /**
     * @param pUserName the userName to set
     */
    public void setUserName(String pUserName) {
        userName = pUserName;
    }

    /**
     * @param pRealName the realName to set
     */
    public void setRealName(String pRealName) {
        realName = pRealName;
    }

    /**
     * @param pRemark1 the remark1 to set
     */
    public void setRemark1(String pRemark1) {
        remark1 = pRemark1;
    }

    /**
     * @param pRemark2 the remark2 to set
     */
    public void setRemark2(String pRemark2) {
        remark2 = pRemark2;
    }

}
