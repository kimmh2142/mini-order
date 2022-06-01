package toy.project.miniorder.dao;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import toy.project.miniorder.model.OrderModel;

import java.util.List;


@RequiredArgsConstructor
@Repository
public class OrderDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    public int insertOrder(OrderModel model) {
        return sqlSessionTemplate.insert("OrderMapper.insertOrder", model);
    }

    public List<OrderModel> selectOrders(OrderModel model) {
        return sqlSessionTemplate.selectList("OrderMapper.selectOrders", model);
    }

    public int updateOrder(OrderModel model) {
        return sqlSessionTemplate.update("OrderMapper.updateOrder", model);
    }

    public int deleteOrder(OrderModel model) {
        return sqlSessionTemplate.delete("OrderMapper.deleteOrder", model);
    }

    public OrderModel selectOrder(OrderModel model) {
        return sqlSessionTemplate.selectOne("OrderMapper.selectOrder", model);
    }
}
