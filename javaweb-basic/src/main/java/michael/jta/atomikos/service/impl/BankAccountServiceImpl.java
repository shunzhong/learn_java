package michael.jta.atomikos.service.impl;

import java.util.Date;

import michael.jta.atomikos.dao.BankAccountDao;
import michael.jta.atomikos.dao.UserInfoDao;
import michael.jta.atomikos.domain.BankAccount;
import michael.jta.atomikos.domain.UserInfo;
import michael.jta.atomikos.service.BankAccountService;

/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
public class BankAccountServiceImpl implements BankAccountService {

    private BankAccountDao bankAccountDao;

    private UserInfoDao userInfoDao;

    /**
     * 转账测试
     * @param srcId
     * @param destId
     * @param money
     * @return boolean
     */
    public boolean doTestTransfer(String srcId, String destId, float money) {

        BankAccount srcAccount = bankAccountDao.getByUserName(srcId);
        BankAccount destAccount = bankAccountDao.getByUserName(destId);
        if (srcAccount.getDeposit() < money) {
            System.out.println("warn :" + srcAccount.getUserName()
                    + " has not enough money to transfer");
            return false;
        }
        srcAccount.setDeposit(srcAccount.getDeposit() - money);
        destAccount.setDeposit(destAccount.getDeposit() + money);
        bankAccountDao.update(srcAccount);
        bankAccountDao.update(destAccount);

        Date curTime = new Date();
        UserInfo srcUser = userInfoDao.getById(srcId);
        UserInfo destUser = userInfoDao.getById(destId);

        destUser.setRemark1(curTime + "");
        destUser.setRemark2(curTime + "");
        userInfoDao.update(destUser);
        srcUser.setRemark1(curTime + "");
        if (srcAccount.getDeposit() < 18000) {
            throw new RuntimeException("michael test exception for JTA  ");
        }
        srcUser.setRemark2(curTime + "");
        userInfoDao.update(srcUser);
        System.out.println("success done:" + srcAccount.getUserName()
                + " transfer ￥" + money + " to " + destAccount.getUserName());

        return true;
    }

    /**
     * @param pBankAccountDao the bankAccountDao to set
     */
    public void setBankAccountDao(BankAccountDao pBankAccountDao) {
        bankAccountDao = pBankAccountDao;
    }

    /**
     * @param pUserInfoDao the userInfoDao to set
     */
    public void setUserInfoDao(UserInfoDao pUserInfoDao) {
        userInfoDao = pUserInfoDao;
    }

}
