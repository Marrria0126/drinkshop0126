package com.southwind.drinkshop.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yihong
 * @since 2021-03-07
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class OrderDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private Integer orderId;

    private Integer productId;

    private Integer quantity;

    private Float cost;


}
