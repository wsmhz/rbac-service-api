package com.wsmhz.security.rbac.service.api.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By tangbj On 2019/7/31
 * Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminLoginInfoVo {

    private String username;

    private boolean status;

    private String password;

    private String phone;

    @Builder.Default
    private Set<String> resources = new HashSet<>();

}
