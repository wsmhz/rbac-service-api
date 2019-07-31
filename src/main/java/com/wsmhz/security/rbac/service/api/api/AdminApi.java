package com.wsmhz.security.rbac.service.api.api;

import com.wsmhz.security.rbac.service.api.domain.vo.AdminLoginInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created By tangbj On 2019/7/31
 * Description:
 */
@FeignClient("rbac-service")
public interface AdminApi {

    @GetMapping("/select/username")
    AdminLoginInfoVo selectByUsernameForLogin(@RequestParam("username") String username);
}
