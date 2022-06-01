package toy.project.miniorder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import toy.project.miniorder.dao.OrderDao;
import toy.project.miniorder.dto.OrderReqDTO;
import toy.project.miniorder.dto.OrderResDTO;
import toy.project.miniorder.model.OrderModel;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderDao orderDao;

    public int insertOrder(OrderReqDTO orderReqDTO) {
        OrderModel orderModel = new OrderModel();
        BeanUtils.copyProperties(orderReqDTO, orderModel);
        return orderDao.insertOrder(orderModel);
    }

    public List<OrderResDTO> selectOrders(OrderReqDTO orderReqDTO) {
        List<OrderResDTO> result = new ArrayList<>();
        OrderModel orderModel = new OrderModel();
        BeanUtils.copyProperties(orderReqDTO, orderModel);

        List<OrderModel> datas = orderDao.selectOrders(orderModel);
        for (OrderModel item : datas) {
            result.add(new OrderResDTO(item));
        }
        return result;
    }

    public OrderResDTO selectOrder(OrderReqDTO orderReqDTO) {
        OrderModel orderModel = new OrderModel();
        BeanUtils.copyProperties(orderReqDTO, orderModel);
        OrderModel data = orderDao.selectOrder(orderModel);
        return new OrderResDTO(data);
    }
    public int updateOrder(OrderReqDTO orderReqDTO) {
        OrderModel orderModel = new OrderModel();
        BeanUtils.copyProperties(orderReqDTO, orderModel);
        return orderDao.updateOrder(orderModel);
    }

    public int deleteOrder(OrderReqDTO orderReqDTO) {
        OrderModel orderModel = new OrderModel();
        BeanUtils.copyProperties(orderReqDTO, orderModel);
        return orderDao.deleteOrder(orderModel);
    }


}
