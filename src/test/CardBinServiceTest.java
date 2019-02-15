import com.google.gson.Gson;
import com.han.model.po.DepositBin;
import com.han.service.bin.CardBin;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * author:hanpeiyi
 * Date:2019/2/15
 * Time:14:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
public class CardBinServiceTest {
    public final static Logger LOGGER = Logger.getLogger(CardBinServiceTest.class);
    @Resource
    private CardBin cardBin;
    @Test
    public void getCareBin(){
        Integer bin = 9111;
        try {
            DepositBin depositBin = cardBin.findCardInfoByBin(bin);
            LOGGER.info("转换后的json数据为" + new Gson().toJson(depositBin));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
