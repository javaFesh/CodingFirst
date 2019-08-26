package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.CollectDao;
import com.fjut.oj.edu.dto.CollectDto;
import com.fjut.oj.edu.model.Collect;
import com.fjut.oj.edu.service.CollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CollectServiceImpl implements CollectService {

    @Resource
    CollectDao collectDao;


    /**
     * 添加收藏
     *
     * @param collect
     * @return
     */
    @Override
    public Boolean insertCollect(Collect collect) {
        return collectDao.insertCollect(collect);
    }

    /**
     * 删除收藏
     *
     * @param collectId
     * @return
     */
    @Override
    public Boolean deleteCollect(Integer collectId) {
        return collectDao.deleteCollect(collectId);
    }

    /**
     * 查看个人收藏
     *
     * @param userId
     * @return
     */
    @Override
    public List<Collect> findMyCollect(Integer userId) {
        return collectDao.findMyCollect(userId);
    }



    /**
     * 提取个人收藏真实内容
     *
     * @param userId
     * @return
     */
    @Override
    public List<CollectDto> findMyCollectDto(Integer userId) {
        List<Collect> collects=collectDao.findMyCollect(userId);
        for (int i=0;i<collects.size();i++){

        }
        return null;
    }

    /**
     * 查看某个收藏
     *
     * @param collectId
     * @return
     */
    @Override
    public Collect findMyCollectById(Integer collectId) {
        return null;
    }

    /**
     * 提取某个个人收藏真实内容
     *
     * @param collectId
     * @return
     */
    @Override
    public CollectDto findMyCollectByIdDto(Integer collectId) {
        return null;
    }
}
