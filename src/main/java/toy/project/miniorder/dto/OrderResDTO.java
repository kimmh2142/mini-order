package toy.project.miniorder.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.BeanUtils;
import toy.project.miniorder.model.OrderModel;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class OrderResDTO {
    int orderNo;
    int productNo;
    String sellerId;
    String userId;
    int orderQuantity;
    int orderPrice;
    String orderState;
    Timestamp produceDate;
    String produceId;
    Timestamp modifyDate;
    String modifyId;


    public OrderResDTO(OrderModel item) {
        BeanUtils.copyProperties(item, this);
    }
}
