package com.youzufang.service;

import com.youzufang.model.Account;
import com.youzufang.model.House;

import java.util.List;

// 用户相关
public interface AccountService {

    // 注册
    // 把一个 account 添加到数据库里
    Account register(Account account);

    // 登录
    // 检查 username 和 password 是否正确, 正确则返回一个 account 对象
    // 在 controller 层保存到 session里
    Account login(String username, String password);


    Account getUserById(int id);

    // 收藏夹相关
    // 获得用户的收藏夹, 返回 user.favoriteSet.items 里的每个 house 的信息
    // 上面这一步要遍历整个返回出来的列表然后对每个 FavoriteSetItem 调用 HouseService 那边的 getHouseById 再组合到一个新 List 里
    // 这里应该可以优化, 看model那边实现怎么改
    List<House> getUserFavorite(Account user);

    // 添加到收藏夹
    // 获得用户的收藏夹, 然后创建一个新的 FavoriteSetItem, 设置它的 houseId 之后添加到 user.favoriteSet.items 里
    List<House> addHouseToUserFavorite(Account user, House house);

    // 删掉收藏夹里的收藏
    // 逻辑和上面的差不多
    List<House> removeHouseFromUserFavorite(Account user, House house);
}
