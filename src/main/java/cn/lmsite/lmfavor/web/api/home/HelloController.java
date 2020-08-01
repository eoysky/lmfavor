package cn.lmsite.lmfavor.web.api.home;

import cn.lmsite.lmfavor.commons.result.BaseResult;
import cn.lmsite.lmfavor.enums.CommonResultEnum;
import cn.lmsite.lmfavor.vo.user.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 你好控制器
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Controller
@ResponseBody
public class HelloController {

    /**
     * 用户注册
     *
     * @param userRequest 用户请求
     * @return {@link BaseResult<Integer>}
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public BaseResult<String> userRegister(@RequestBody UserRequest userRequest) {
        return new BaseResult<>(CommonResultEnum.A0000,"你好， LmFavor！接口访问成功！");
    }
}
