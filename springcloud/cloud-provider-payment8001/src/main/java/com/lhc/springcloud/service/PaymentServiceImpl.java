package com.lhc.springcloud.service;

import com.lhc.springcloud.dao.PaymentDao;
import com.lhc.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lhc
 * @cerate 2021-8-5
 * @Decription 服务提供者service
 * */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentDao paymentDao;

    /**
     *@Description 插入
     * */
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    /**
     *@Description 根据id查询
     * */
    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }


}
