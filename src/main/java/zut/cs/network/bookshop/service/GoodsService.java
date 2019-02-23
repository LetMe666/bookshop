package zut.cs.network.bookshop.service;

import zut.cs.network.bookshop.entity.Goods;
import zut.cs.network.bookshop.entity.PageBean;

/**
商品业务逻辑操作
 */
public interface GoodsService extends BaseService<Goods> {

    /**
     * 分页查询
     * @param goods 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Goods goods, int pageCode, int pageSize);
}
