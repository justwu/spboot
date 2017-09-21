package com.just;

import com.just.pojo.otarequest.WxRequestForm;
import com.just.service.api.OtaService;
import com.just.utils.CalculateDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpbootApplicationTests {

    @Autowired
    OtaService otaService;

    @Test
    public void testOtaservice() throws Exception {
        WxRequestForm requestForm = new WxRequestForm();
        requestForm.setStartdate(new Date());
        requestForm.setEnddate(CalculateDate.reckonDay(new Date(), 5, 1));
        String json = otaService.wxQuerySections(requestForm).toString();
        System.out.println(json);

    }

    @Test
    public void testshiro() {


    }

}
