package com.fjut.oj.edu.service;

import com.fjut.oj.edu.dto.CollectDto;
import com.fjut.oj.edu.model.Collect;

import java.util.List;

public interface CollectService {


    /**
     * 添加收藏
     * @param collect
     * @return
     */
    Boolean insertCollect(Collect collect);


    /**
     * 删除收藏
     * @param collectId
     * @return
     */
    Boolean deleteCollect(Integer collectId);


    /**
     * 查看个人收藏
     * @param userId
     * @return
     */
    List<Collect> findMyCollect(Integer userId);


    /**
     * 提取个人收藏真实内容
     * @param userId
     * @return
     */
    List<CollectDto> findMyCollectDto(Integer userId);

    /**
     * 查看某个收藏
     * @param collectId
     * @return
     */
    Collect findMyCollectById(Integer collectId);

    /**
     * 提取某个个人收藏真实内容
     * @param collectId
     * @return
     */
    CollectDto findMyCollectByIdDto(Integer collectId);
}
