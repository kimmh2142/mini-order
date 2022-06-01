package toy.project.miniorder.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class OrderReqDTO {
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
