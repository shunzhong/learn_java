package michael.jta.atomikos.dao;

import michael.jta.atomikos.domain.UserInfo;

/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
public interface UserInfoDao {

    /**
     * @param userName
     * @return UserInfo
     */
    UserInfo getById(String userName);

    /**
     * @param userInfo
     */
    void update(UserInfo userInfo);

}
