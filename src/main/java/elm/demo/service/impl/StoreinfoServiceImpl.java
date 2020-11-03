package elm.demo.service.impl;

import elm.demo.dao.GoodsMapper;
import elm.demo.dao.OrderlistMapper;
import elm.demo.dao.StAcMapper;
import elm.demo.dao.StoreinfoMapper;
import elm.demo.domain.*;
import elm.demo.service.StoreinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "storeinfoService")
public class StoreinfoServiceImpl implements StoreinfoService {
    @Autowired
    private StoreinfoMapper storeinfoMapper;
    @Autowired
    private OrderlistMapper orderlistMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private StAcMapper stAcMapper;

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
        //删除对应的订单
        OrderlistExample ordersExample = new OrderlistExample();
        ordersExample.createCriteria().andOstoreidEqualTo(sid);
        orderlistMapper.deleteByExample(ordersExample);
        //删除商户对应的商品
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andGtidEqualTo(sid);
        goodsMapper.deleteByExample(goodsExample);
        //删除商户对应的活动列表内容
       StAcExample stAcExample = new StAcExample();
        stAcExample.createCriteria().andFsidEqualTo(sid);
        stAcMapper.deleteByExample(stAcExample);
        //删除商户
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
    public List<Storeinfo> selectByExampleWithObject(StoreinfoExample example) {
        return storeinfoMapper.selectByExampleWithObject(example);
    }

    @Override
    public Storeinfo selectByPrimaryKeyWithObject(Integer sid) {
        return storeinfoMapper.selectByPrimaryKeyWithObject(sid);
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

    @Override
    public int updateOffer(Integer sid, Integer aid, Boolean offer) {
        if(offer){//如果为true则关闭该活动
            StAcExample stAcExample = new StAcExample();
            stAcExample.createCriteria().andFsidEqualTo(sid).andFaidEqualTo(aid);
            stAcMapper.deleteByExample(stAcExample);
        }else{
            StAc stAc = new StAc();
            stAc.setFaid(aid);
            stAc.setFsid(sid);
            stAcMapper.insertSelective(stAc);
        }
        return 0;
    }
}
