package toy.project.miniorder.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class OrderModel {
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
}