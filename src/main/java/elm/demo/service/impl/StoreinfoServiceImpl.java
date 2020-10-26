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
        return 0;
    }

    @Override
    public int deleteByExample(StoreinfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return 0;
    }

    @Override
    public int insert(Storeinfo record) {
        return 0;
    }

    @Override
    public int insertSelective(Storeinfo record) {
        return 0;
    }

    @Override
    public List<Storeinfo> selectByExample(StoreinfoExample example) {
        return null;
    }

    @Override
    public Storeinfo selectByPrimaryKey(Integer sid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Storeinfo record, StoreinfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Storeinfo record, StoreinfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Storeinfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Storeinfo record) {
        return 0;
    }
}
