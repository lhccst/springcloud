package com.lhc.springcloud.dao;

import com.lhc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author lhc
 * @cerate 2021-8-5
 * */
@Mapper
@Repository
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
