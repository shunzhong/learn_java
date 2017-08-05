package michael.jta.atomikos.service;


/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
public interface BankAccountService {

    /**
     * @param srcId
     * @param destId
     * @param money
     * @return boolean
     */
    boolean doTestTransfer(String srcId, String destId, float money);

}
