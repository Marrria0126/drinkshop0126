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
public class ProductCategory implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private Integer parentId;

    private Integer type;


}
