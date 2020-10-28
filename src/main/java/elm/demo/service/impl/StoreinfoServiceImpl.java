package elm.demo.service.impl;

import elm.demo.dao.StoreinfoMapper;
import elm.demo.domain.Storeinfo;
import elm.demo.domain.StoreinfoExample;
import elm.demo.service.StoreinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "storeinfoService")
public class StoreinfoServiceImpl implements StoreinfoService {
    @Autowired
    private StoreinfoMapper storeinfoMapper;
    @Override
    public long countByExample(StoreinfoExample example) {
        return storeinfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StoreinfoExample example) {
        return storeinfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return storeinfoMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int insert(Storeinfo record) {
        return storeinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Storeinfo record) {
        return storeinfoMapper.insertSelective(record);
    }

    @Override
    public List<Storeinfo> selectByExample(StoreinfoExample example) {
        return storeinfoMapper.selectByExample(example);
    }

    @Override
    public Storeinfo selectByPrimaryKey(Integer sid) {
        return storeinfoMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByExampleSelective(Storeinfo record, StoreinfoExample example) {
        return storeinfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Storeinfo record, StoreinfoExample example) {
        return storeinfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Storeinfo record) {
        return storeinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Storeinfo record) {
        return storeinfoMapper.updateByPrimaryKey(record);
    }
}
