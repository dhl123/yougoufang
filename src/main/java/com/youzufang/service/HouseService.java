package com.youzufang.service;

import com.youzufang.model.House;

import java.util.List;


// 房源相关
// 评论的在 ReviewService 里
public interface HouseService {
    // 发布房屋
    // 创建一个 house 对象然后把里面的 user 设置成发布人
    // 返回发布后的 house
    House releaseHouse(House house);

    House getHouseById(int id);

    // 直接查出所有的 house, 考虑那边用带分页的那个Page...Repository?
    List<House> getAllHouse();






    // 按 xx 条件筛选
    // 下面要有一大堆筛选和查询的 service, 写起来估计会很混乱, 先放着
    // 这个方法应该要设计成一个流式的然后可以串起来, 不然对于复合条件的查询很难做
    // 比如说下面这个调用
    // new HouseFilter(getAllHouse()).Keyword("精装修").BookRange(100,200).orderBy(Keys.RentMoney).toList()
    // 可以查含有关键词"精装修", 定金100-200之内的, 按租金排序后的房源, 返回 List<House>

    // 基于一个 HouseFilter(自己写) 之类的对象进行操作, 再返回一个 HouseFilter 就可以串起来, 最后有个 toList() 方法

}
