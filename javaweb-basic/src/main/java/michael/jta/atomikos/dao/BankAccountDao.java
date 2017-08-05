package michael.jta.atomikos.dao;

import java.util.ArrayList;
import java.util.List;

import michael.jta.atomikos.domain.BankAccount;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
public class BankAccountDao extends HibernateDaoSupport {

    /**
     * @param id
     * @return BankAccount
     */
    public BankAccount getById(Integer id) {
        return /*(BankAccount) this.getSession().get(BankAccount.class, id)*/ null;
    }

    /**
     * @param userName
     * @return BankAccount
     */
    @SuppressWarnings("unchecked")
    public BankAccount getByUserName(String userName) {
        List<BankAccount> list = new ArrayList<>(6) /*this.getSession().createQuery(
                "select t from BankAccount t where t.userName=:userName")
                .setParameter("userName", userName).list()*/;
        return list.isEmpty() ? null : list.get(0);
    }

    /**
     * @param account
     */
    public void update(BankAccount account) {
        /*this.getSession().update(account);*/
    }

}
