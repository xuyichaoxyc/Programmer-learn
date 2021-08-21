package org.xyc.design.demo.store;


import org.xyc.design.demo.store.Impl.CardCommodityService;
import org.xyc.design.demo.store.Impl.CouponCommodityService;
import org.xyc.design.demo.store.Impl.GoodsCommodityService;

public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
