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
        return activeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ActiveExample example) {
        return activeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return activeMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public int insert(Active record) {
        return activeMapper.insert(record);
    }

    @Override
    public int insertSelective(Active record) {
        return activeMapper.insertSelective(record);
    }

    @Override
    public List<Active> selectByExample(ActiveExample example) {
        return activeMapper.selectByExample(example);
    }

    @Override
    public Active selectByPrimaryKey(Integer aid) {
        return activeMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int updateByExampleSelective(Active record, ActiveExample example) {
        return activeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Active record, ActiveExample example) {
        return activeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Active record) {
        return activeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Active record) {
        return activeMapper.updateByPrimaryKey(record);
    }
}
