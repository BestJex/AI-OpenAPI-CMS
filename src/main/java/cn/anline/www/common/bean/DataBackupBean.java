package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 *数据备份模型
 */
@Entity("data_backup")
public class DataBackupBean extends MorphiaModel<DataBackupBean> {
}
