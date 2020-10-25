package elm.demo.service.impl;

import elm.demo.dao.ActiveMapper;
import elm.demo.domain.Active;
import elm.demo.domain.ActiveExample;
import elm.demo.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "activeService")
public class ActiveServiceImpl implements ActiveService {

    @Autowired
    private ActiveMapper activeMapper;

    @Override
    public long countByExample(ActiveExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ActiveExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return 0;
    }

    @Override
    public int insert(Active record) {
        return 0;
    }

    @Override
    public int insertSelective(Active record) {
        return 0;
    }

    @Override
    public List<Active> selectByExample(ActiveExample example) {
        return activeMapper.selectByExample(example);
    }

    @Override
    public Active selectByPrimaryKey(Integer aid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Active record, ActiveExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Active record, ActiveExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Active record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Active record) {
        return 0;
    }
}
