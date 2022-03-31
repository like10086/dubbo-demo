package org.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: Test
 * @Description:
 * @author: like
 * @date 2022/3/31 13:52
 */
@Data
@Builder
public class User implements Serializable {
    private String userName;
    private String userAddress;
}
