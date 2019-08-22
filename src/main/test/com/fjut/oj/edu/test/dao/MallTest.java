package com.fjut.oj.edu.test.dao;

import com.fjut.oj.edu.dao.MallDao;
import com.fjut.oj.edu.model.Mall;
import com.fjut.oj.edu.test.BaseJunit4Test;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MallTest extends BaseJunit4Test {
    @Resource
    MallDao mallDao;
    Date t = new Date();

//    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Mall mall=new Mall(8,"东222东","爱仕达多",123,123,2,new Date(),1,1);





    @Test
    public void malldaoTest(){
        List<Mall> malls=mallDao.findAllByPage(new RowBounds(2,3));
        Mall malll=mallDao.findById(8);
        System.out.println(malll.getMallId()+"__"+malll.getMallTitle()+""+malll.getEndTime());
        System.out.println(malls.size());
        for (Mall mall: malls
        ) {
            System.out.println(mall.getMallId()+"__"+mall.getMallTitle()+""+mall.getEndTime());

        }
        if (mallDao.updataMall(mall)){
           System.out.println("好了");
        }
        else {
            System.out.println("完了");
        }


    }


    @Test
    public void testCount() {
        System.out.println(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA "+mallDao.getMallCount());


    }
    }
