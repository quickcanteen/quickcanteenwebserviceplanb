package com.quickcanteen.mapper;

import com.quickcanteen.model.CollectDishesKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface CollectDishesMapper {
    @Delete({
        "delete from collect_dishes",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and collector_id = #{collectorId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CollectDishesKey key);

    @Insert({
        "insert into collect_dishes (dishes_id, collector_id)",
        "values (#{dishesId,jdbcType=INTEGER}, #{collectorId,jdbcType=INTEGER})"
    })
    int insert(CollectDishesKey record);

    int insertSelective(CollectDishesKey record);
}