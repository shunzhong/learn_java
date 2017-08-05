package michael.jta.atomikos;

import michael.jta.atomikos.service.BankAccountService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author michael <br>
 *         blog: http://sjsky.iteye.com
 */
public class JtaRunMainTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("------------start");
        ApplicationContext appCt = new ClassPathXmlApplicationContext(
                "jta.spring.xml");
        System.out.println("------------finished init xml");

        Object bean = appCt.getBean("bankAccountServiceProxy");
        System.out.println(bean.getClass());
        BankAccountService service = (BankAccountService) bean;
        service.doTestTransfer("husband", "wife", 2000);
    }
}
