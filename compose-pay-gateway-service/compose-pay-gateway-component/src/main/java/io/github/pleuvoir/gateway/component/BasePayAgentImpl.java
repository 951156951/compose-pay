package io.github.pleuvoir.gateway.component;

import io.github.pleuvoir.gateway.common.aop.MethodTimeLog;
import io.github.pleuvoir.gateway.model.po.MerchantPO;
import io.github.pleuvoir.gateway.model.vo.ResultMessageVO;
import io.github.pleuvoir.gateway.service.PayService;
import io.github.pleuvoir.gateway.service.internal.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.pleuvoir.gateway.agent.BasePayAgent;
import io.github.pleuvoir.gateway.model.dto.PaymentDTO;
import io.github.pleuvoir.gateway.model.vo.ResultBasePayVO;
import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;

/**
 * @author pleuvoir
 */
@Slf4j
@Service
public class BasePayAgentImpl implements BasePayAgent {

    @Autowired
    private PayService payService;

    @MethodTimeLog("发起支付请求")
    @Override
    public ResultMessageVO<ResultBasePayVO> pay(@Valid PaymentDTO dto) {
        return ResultMessageVO.success();
    }

}
