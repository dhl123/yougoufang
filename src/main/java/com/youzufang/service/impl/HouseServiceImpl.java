package com.youzufang.service.impl;

import com.youzufang.dao.HouseDao;
import com.youzufang.model.House;
import com.youzufang.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService{
    final HouseDao dao;

    @Autowired
    public HouseServiceImpl(HouseDao dao) {
        this.dao = dao;
    }
    public House getHouseById(int id){
        return dao.getHouseByHouseId(id);
    }
    // 发布房屋
    // 创建一个 house 对象然后把里面的 user 设置成发布人
    // 返回发布后的 house
    public House releaseHouse(House house){
        dao.save(house);
        return house;
    }

    // 直接查出所有的 house, 考虑那边用带分页的那个Page...Repository?
    public List<House> getAllHouse(){
        return dao.findAll();
    }

    // 按 xx 条件筛选
    // 下面要有一大堆筛选和查询的 service, 写起来估计会很混乱, 先放着
    // 这个方法应该要设计成一个流式的然后可以串起来, 不然对于复合条件的查询很难做
    // 比如说下面这个调用
    // new HouseFilter(getAllHouse()).Keyword("精装修").BookRange(100,200).orderBy(Keys.RentMoney).toList()
    // 可以查含有关键词"精装修", 定金100-200之内的, 按租金排序后的房源, 返回 List<House>

    // 基于一个 HouseFilter(自己写) 之类的对象进行操作, 再返回一个 HouseFilter 就可以串起来, 最后有个 toList() 方法

}
