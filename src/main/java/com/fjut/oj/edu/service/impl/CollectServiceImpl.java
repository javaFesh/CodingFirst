package com.fjut.oj.edu.service.impl;

import com.fjut.oj.edu.dao.CollectDao;
import com.fjut.oj.edu.dao.CourseDao;
import com.fjut.oj.edu.dao.DiscussDao;
import com.fjut.oj.edu.dao.ProblemDao;
import com.fjut.oj.edu.dto.CollectDto;
import com.fjut.oj.edu.model.Collect;
import com.fjut.oj.edu.model.Course;
import com.fjut.oj.edu.model.Discuss;
import com.fjut.oj.edu.model.Problem;
import com.fjut.oj.edu.service.CollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CollectServiceImpl implements CollectService {

    @Resource
    CollectDao collectDao;

    @Resource
    CourseDao courseDao;

    @Resource
    DiscussDao discussDao;

    @Resource
    ProblemDao problemDao;


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
    public CollectDto findMyCollectDto(Integer userId) {
        CollectDto collectDto=null;
        collectDto.setUserId(userId);
        List<Course> courseList = null;
        List<Discuss> discussList= null;
        List<Problem> problemList= null;
        List<Collect> collects=collectDao.findMyCollect(userId);
        for (int i=0;i<collects.size();i++){
            if (collects.get(i).getCourseId()!=null){
                courseList.add(courseDao.findCourseById(collects.get(i).getCourseId()));
            }
            if (collects.get(i).getDiscussId()!=null){
                discussList.add(discussDao.queryDiscussById(collects.get(i).getDiscussId()));
            }
            if (collects.get(i).getProblemId()!=null){
                problemList.add(problemDao.queryById(collects.get(i).getProblemId()));
            }
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
