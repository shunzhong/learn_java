package michael.jta.atomikos.dao.impl;

import michael.jta.atomikos.dao.UserInfoDao;
import michael.jta.atomikos.domain.UserInfo;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
public class UserInfoDaoImpl extends HibernateDaoSupport implements UserInfoDao {

    /**
     * @param userName
     * @return UserInfo
     */
    public UserInfo getById(String userName) {
        return/* (UserInfo) this.getSession().get(UserInfo.class, userName);*/ null;
    }

    /**
     * @param userInfo
     */
    public void update(UserInfo userInfo) {
        /*this.getSession().update(userInfo);*/
    }

}
