package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.MallDao;
import com.fjut.oj.edu.model.Mall;
import com.fjut.oj.edu.service.MallService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MallServiceImpl implements MallService {
    @Resource
    private MallDao mallDao;

    @Override
    public Boolean updataMall(Mall mall) {
        return mallDao.updataMall(mall);
    }

    @Override
    public Integer mallCount() {
        return (mallDao.getMallCount()+10-1)/10;
    }

    @Override
    public List<Mall> findAllByPage(int pageNum) {
        //每页十条，可调整
        return mallDao.findAllByPage(new RowBounds( (pageNum-1)*10,10));
    }
}
