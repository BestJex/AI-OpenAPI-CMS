package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 支付宝支付模型
 */
@Entity("payment_alipay")
public class PaymentAlipayBean extends MorphiaModel<PaymentAlipayBean> {
}
